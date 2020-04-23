package com.gemini.aop2;

import com.gemini.tools.SpelParser;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.concurrent.TimeUnit;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/23 9:21
 */
@Aspect
@Component
public class DoHomeWorkAspect {

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * *  表示任意返回值
     * Spring Aop中execution的语法 <a href="https://blog.csdn.net/mianyao1004/article/details/93656829"/>
     */
    @Pointcut("execution(* com.gemini.aop2.DoHomeWorkController.doHomeWork(..))")
    public void homeWorkPointcut() {

    }

    @Before("homeWorkPointcut()")
    public void beforeHomeWork() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        String name = request.getParameter("name");
        System.out.println(name + "想吃冰淇淋");
        System.out.println("Before.....................");
    }

    @After("homeWorkPointcut()")
    public void after() {
        System.out.println("after.....................");
    }

    @Around("homeWorkPointcut()")
    public Object around(ProceedingJoinPoint joinPoint) {

        System.out.println("环绕通知，方法执行前........");
        Object result = null;
        try {
            MethodSignature signature = (MethodSignature) joinPoint.getSignature();
            Method method = signature.getMethod();
            RedisKey redisKey = method.getAnnotation(RedisKey.class);
            Parameter[] parameters = method.getParameters();
            String[] par = new String[parameters.length];
            for (int i = 0; i < parameters.length; i++) {
                par[i] = parameters[i].getName();
            }

            String key = SpelParser.getKey(redisKey.prefix() + redisKey.value(), par, joinPoint.getArgs());
            Object o = redisTemplate.opsForValue().get(key);
            if (o != null) {
                return o;
            }
            result = joinPoint.proceed();
            redisTemplate.opsForValue().set(key, result, redisKey.timeout(), TimeUnit.SECONDS);
            System.out.println("环绕通知，方法执行后......");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            try {
                return joinPoint.proceed();
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }

        return result;
    }
}
