package com.gemini.tools;

import org.openjdk.jol.info.ClassLayout;

/**
 * todo (用一句话描述该文件做什么)
 *  指针亚搜默认开启 -XX:+UseCompressedOops
 * @author xiaocuizi
 * @since 0.0.1 2020/5/17 16:13
 */
public class TestObjSize {
    int a = 10;
    static int[] arr = {0, 1, 2, 4};
    int b = 10;

    public static void main(String[] args) {
        TestObjSize testObjSize = new TestObjSize();
        System.out.println(ClassLayout.parseInstance(testObjSize).toPrintable());
        System.out.println(ClassLayout.parseInstance(arr).toPrintable());
    }

}
