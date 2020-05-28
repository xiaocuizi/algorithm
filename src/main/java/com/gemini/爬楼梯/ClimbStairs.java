package com.gemini.爬楼梯;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/9 11:54
 */
public class ClimbStairs {

    public static void main(String[] args) {
        System.out.println(climb(4));
    }
   static int climb(int n) {
        if (n <= 2) {
            return n;
        }
        return climb(n - 1) + climb(n - 2);
    }
}
