package com.gemini.base;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/3/28 11:27
 */
public class IntTest {

    public static void main(String[] args) {
        // System.out.println(123 % 10);
        // System.out.println(1 / 10);
        int i = 2 << 1;
        System.out.println(i);
//        System.out.printf("result=%s", reverse(1534236469));
    }

    private static int reverse(int x) {
        if (x == 0) {
            return x;
        }
        int y = 0;
        while (x != 0) {
            // 个位数
            y = y * 10 + (x % 10);
            if (y > Integer.MAX_VALUE || y < Integer.MIN_VALUE) {
                return 0;
            }
            // 砍掉个位
            x /= 10;

        }
        return y;
    }
}
