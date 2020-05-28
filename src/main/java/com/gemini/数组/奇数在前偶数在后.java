package com.gemini.数组;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/10 10:58
 */
public class 奇数在前偶数在后 {

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
