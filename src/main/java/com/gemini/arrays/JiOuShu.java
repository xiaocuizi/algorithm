package com.gemini.arrays;

import java.util.Arrays;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/5 20:17
 */
public class JiOuShu {


    public static void main(String[] args) {
        // int[] arr ={2,3,1,5,6,8,9,12,11};
        // reOrderArray2(arr);
        // System.out.println(Arrays.toString(arr));
        System.out.println(8 % 136);
        System.out.println(8 & 4);
    }

    public static void reOrderArray2(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            while (left < right && array[left] % 2 != 0) {
                left++;
                System.out.println("left=" + left);
            }
            while (left < right && array[right] % 2 == 0) {
                right--;
                System.out.println("right=" + right);
            }

            if (left < right) {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
            }
        }
    }
}
