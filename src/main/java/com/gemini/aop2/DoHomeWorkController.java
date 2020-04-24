package com.gemini.aop2;

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

    public static final String s = "order_";


    @GetMapping("/doHomework")
    @RedisKey(value = "#name",prefix = s,timeout = 10)
    public String  doHomeWork(String uid,String pid,String name) {
        System.out.println(name + ",做作业");
        return "adnaodno";

    }

}
