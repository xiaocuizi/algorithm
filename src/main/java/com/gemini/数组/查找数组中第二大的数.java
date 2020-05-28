package com.gemini.数组;

import java.util.Arrays;

/**
 * 无序数组
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/10 21:55
 */
public class 查找数组中第二大的数 {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4}; // k=2 结果为5
        solution(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public int solution(int[] arr) {

        int length = arr.length;
        if (arr == null || length < 1) {
            return -1;
        }
        if (arr.length < 2) {
            return arr[0];
        }
        int pivot = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < pivot) {
                arr[i] = pivot;
            } else if (arr[i] > pivot) {

            } else {

            }
        }

        return -1;
    }

    public static void solution(int[] arr, int start, int end) {

        if (start < end) {
            int low = start;
            int high = end;
            int base = arr[start];
            while (low < high) {
                while (low < high && base <= arr[high]) {
                    high--;
                }
                arr[low] = arr[high];
                while (low < high && arr[low] <= base) {
                    low++;
                }
                arr[high] = arr[low];
            }
            arr[low] = base;

            solution(arr, start, low);
            solution(arr, low + 1, end);
        }
    }
}
