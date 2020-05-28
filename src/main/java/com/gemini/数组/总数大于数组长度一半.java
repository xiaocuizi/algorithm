package com.gemini.数组;

import java.util.Arrays;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/15 10:38
 */
public class 总数大于数组长度一半 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 3, 5, 9, 1, 3, 6, 3, 3};
        int i = find(arr);
        System.out.println(i);
    }

    private static int find(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        int totalCount = 0;
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (count > totalCount) {
                totalCount = count;
                if (totalCount >= (length / 2)) {
                    return arr[i];
                }
            }
            int temp = arr[i];
            for (int j = i + 1; j < length; j++) {
                if (temp == arr[j]) {
                    count++;
                }
            }
        }

        return -1;

    }

}
