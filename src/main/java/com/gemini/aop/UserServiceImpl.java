package com.gemini.aop;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    // @Override
    // public String save(String user) {
    //     System.out.println("保存用户信息");
    //     if ("a".equals(user)) {
    //         throw new RuntimeException();
    //     }
    //     return user;
    // }

    @Log(value = "testppppp")
    @Override
    public void testAnnotationAop() {
        System.out.println("testAnnotationAop");
    }
}
