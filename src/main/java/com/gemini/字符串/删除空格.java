package com.gemini.字符串;

import java.util.Arrays;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/7 15:32
 */
public class 删除空格 {
    public static void main(String[] args) {
        String str = "A B C D ";
        str = str.replace(" ","");
        System.out.println("trim = " + str);
        // trim(str.toCharArray());
        // System.out.println(str.toCharArray()[0] ==' ');
    }

    public static String trim(char[] value) {
        int len = value.length;
        int st = 0;
        char[] val = value;    /* avoid getfield opcode */
        System.out.println(val[st]);
        while ((st < len) && (val[st] <= ' ')) {
            st++;
        }
        while ((st < len) && (val[len - 1] <= ' ')) {
            len--;
        }
        return null;
    }

}
