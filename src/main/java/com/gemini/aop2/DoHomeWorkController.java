package com.gemini.aop2;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.TimeoutUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/23 9:19
 */
@RestController
public class DoHomeWorkController {

    public static final String s = "s";


    @GetMapping("/doHomework")
    @RedisKey(value = "#name",prefix = s,timeout = 78)
    public String  doHomeWork(String uid,String pid,String name) {
        System.out.println(name + ",做作业");
        return "adnaodno";

    }

}
