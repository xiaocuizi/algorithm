package com.gemini.字符串;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 1.0.0 2020/8/2 9:56
 */
public class 最长重复字符串 {

    public static void main(String[] args) {
        String str = "aaabbbbaacccddddddeeerrr";
        System.out.println(str(str));
    }

    public static int str(String string) {
        if (string == null || string.length() < 1) {
            return 0;
        }

        int length = string.length();

        // char[] chars = string.toCharArray();
        int his = 0;
        int cur = 0;
        char p2 = '_';
        for (int i = 0; i < length; i++) {
            char p1 = string.charAt(i);
            if (i + 1 < length) {
                p2 = string.charAt(i + 1);
            }
            if (p1 != p2) {
                his = Math.max(his,  cur++);
                cur = 0;
            } else {
                cur++;
            }
        }
        return his;
    }
}
