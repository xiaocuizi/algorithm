package com.gemini.dp.strategy;


import org.reflections.Reflections;

import java.io.File;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/19 19:35
 */
public class PayFactory {
    private static HashMap<Integer, String> map = new HashMap();

    public static final String BASE_PACKAGE = "com.gemini.dp.strategy.impl";

    static {

        // Reflections set = new Reflections("com.gemini.dp.strategy.impl");
        Reflections reflections = new Reflections(BASE_PACKAGE);
        Set<Class<?>> payTypes = reflections.getTypesAnnotatedWith(PayType.class);
        if (!payTypes.isEmpty()) {
            for (Class<?> c : payTypes) {
                map.put(c.getAnnotation(PayType.class).channelId(), c.getCanonicalName());
            }
        }
    }


    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Pay payStyle = PayFactory.getPayStyle(1);
        System.out.println(payStyle.sale(1, new BigDecimal("0.22")));
    }


    public static Pay getPayStyle(Integer channelId) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Class<?> aClass = Class.forName(map.get(channelId));

        return (Pay) aClass.newInstance();
    }

    // private static class Reflections {
    //     private String scanPackage;
    //
    //     public Reflections(String scanPackage) {
    //         this.scanPackage = scanPackage;
    //     }
    //
    //     public Set scanClasses() {
    //         // 获取包
    //         Set<String> classes = new HashSet();
    //         String s = scanPackage.replaceAll("\\.", "/");
    //         URL url = Thread.currentThread().getContextClassLoader().getResource(s);
    //         File classDir = new File(url.getFile());
    //         // 扫描包
    //         for (File file : classDir.listFiles()) {
    //             if (file.isDirectory()) {
    //                 scanClasses();
    //             } else {
    //                 // 获取包名的路径
    //                 System.out.println(scanPackage + "." + file.getName());
    //                 classes.add(file.getName());
    //             }
    //         }
    //         return classes;
    //     }
    // }
}
