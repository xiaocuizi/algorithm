package com.gemini.字符串;

import java.util.Arrays;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/10 22:04
 */
public class 翻转字符串 {

    public static void main(String[] args) {
        String str = "fedcba";
        char[] chars = str.toCharArray();
        int i = 0;
        int j = 0;
        int size = chars.length;
        char[] taget = new char[size];
        for (i = 0, j = size - 1; j > -1; j--, i++) {
            taget[j] = chars[i];
        }
        System.out.printf("chars=%s", Arrays.toString(taget));
    }
}
