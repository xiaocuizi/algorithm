package com.gemini.test;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/15 10:26
 */
public class MathTest {

    public static void main(String[] args) {
        long round = Math.round(-1.51);
        System.out.println(round);
        System.out.println(0.1 * 3 == 1 * 0.3);
        System.out.println(0.1d * 3 == 1 * 0.3d);
        System.out.println(0.1f * 3 == 1 * 0.3f);
        System.out.println("-------------------");
        System.out.println(0.1f + 3 == 1 + 0.3f);
        System.out.println(0.1d + 3 == 1 + 0.3d);
        System.out.println(0.1 + 3 == 1 + 0.3);
        System.out.println("-------------------");
        System.out.println(0.1 * 3f );
        System.out.println(1 * 0.3f);
        Float f = 0.3f;
        double d = 0.3;
        System.out.println(f);
    }
}
