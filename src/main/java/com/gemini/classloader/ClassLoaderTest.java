package com.gemini.classloader;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/25 15:19
 */
public class ClassLoaderTest {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        systemClassLoader.loadClass("com.gemini.list");
        System.out.println(systemClassLoader);
    }
}
