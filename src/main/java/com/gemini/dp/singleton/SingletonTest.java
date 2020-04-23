package com.gemini.dp.singleton;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/20 19:01
 */
public class SingletonTest {

    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        System.out.println(instance.method());
    }
}
