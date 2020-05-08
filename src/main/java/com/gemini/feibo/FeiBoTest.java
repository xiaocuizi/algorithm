package com.gemini.feibo;

import com.gemini.Times;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/3/31 10:34
 */
public class FeiBoTest {

    public static void main(String[] args) {
        long feibo = feibo6(42);
        Times.test("斐波那契4",()->{
            feibo4(42);
        });
        Times.test("斐波那契5",()->{
            feibo5(42);
        });
        Times.test("斐波那契6",()->{
            feibo6(42);
        });
    }


    public static long feibo(int n) {
        if (n <= 2) {
            return 1;
        }
        int[] arr = new int[n + 1];
        arr[1] = arr[2] = 1;
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }


    // 滚动数组
    public static long feibo4(int n) {
        if (n <= 2) {
            return 1;
        }
        int[] arr = new int[2];
        arr[0] = arr[1] = 1;
        for (int i = 3; i <= n; i++) {
            arr[i % 2] = arr[(i - 1) % 2] + arr[(i - 2) % 2];
        }
        return arr[n % 2];
    }


    // 与运算
    public static long feibo5(int n) {
        if (n <= 2) {
            return 1;
        }
        int[] arr = new int[2];
        arr[0] = arr[1] = 1;
        for (int i = 3; i <= n; i++) {
            arr[i & 1] = arr[(i - 1) & 1] + arr[(i - 2) & 1];
        }
        return arr[n & 1];
    }

    public static long feibo6(int n) {
        if (n <= 2) {
            return 1;
        }
        int first = 1;
        int second = 1;
        for (int i = 3; i <= n; i++) {
            second = first + second;
            // 第二个作为下一个计算的第一个数
            first = second - first;
        }
        return second;
    }
}
