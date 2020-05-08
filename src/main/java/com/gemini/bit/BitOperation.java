package com.gemini.bit;

import java.util.HashSet;
import java.util.Set;

/**
 * 位运算
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/4 22:04
 */
public class BitOperation {
    public static void main(String[] args) {
        int s = 5;
        int t = 6;
        System.out.println(s & t);
        System.out.println(s | t);
        System.out.println(s & ~t);
        // 1、计算一个数的二进制中1的个数
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        set1.add("a");
        set1.add("b");
        set1.add("c");
        set2.add("c");
        set2.add("d");
        set2.add("e");
    }

}
