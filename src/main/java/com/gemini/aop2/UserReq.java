package com.gemini.aop2;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/23 10:23
 */
public class UserReq {

    private String name;
    private int age;
    private String redisKey;

    public String getRedisKey() {
        return redisKey;
    }

    public UserReq() {
        this.redisKey = name + "_" ;
    }

    public void setRedisKey(String redisKey) {
        this.redisKey = name + "_" ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
