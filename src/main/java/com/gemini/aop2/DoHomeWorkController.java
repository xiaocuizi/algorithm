package com.gemini.aop2;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/23 9:19
 */
@RestController
public class DoHomeWorkController {

    @GetMapping("/doHomework")
    @RedisKey(value = "#name")
    public String  doHomeWork(String uid,String pid,String name) {
        System.out.println(name + ",做作业");
        return "adnaodno";

    }

}
