package com.gemini.动态规划;

/**
 * todo (用一句话描述该文件做什么)
 * <p>
 * 题目描述：
 * <p>
 * 给定一个整形数组，其中的第i个元素代表股票第i天的价格。在一开始，你手里有足够的钱，但没有股票。你仅有一次买股票和一次卖股票的机会（每次只能买/卖1股），或者不买不卖。输出你可能的最大盈利值。尽量降低程序的时间复杂度。
 * <p>
 * 样例1：
 * <p>
 * [7, 1, 5, 3, 6, 4]，在价格为1的时候买入，在价格为6的时候卖出，可以得到最大盈利值为5。（5 = 6 - 1）
 * <p>
 * 样例2：
 * <p>
 * [7, 6, 5, 4, 3, 2]，选择不买不卖，最大盈利值为0。
 * ————————————————
 * 版权声明：本文为CSDN博主「Microstrong0305」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/program_developer/article/details/83245488
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/19 18:01
 */
public class 投资股票最大收益值 {


    public static void main(String[] args) {
        int[] array = {7, 1, 5, 3, 6, 4};
        int[] array1 = {7, 6, 5, 4, 3, 2};
        System.out.println(maxSal3(array));
        System.out.println(maxSal3(array1));
    }


    /**
     *
     * 思路：维护两个变量，一个是到目前为止最好的交易，另一个是在当天卖出的最佳交易（也就是局部最优）。
     * 其实，就是求一个数组中连续子数组差最大。
     *
     * 状态转移方程为：
     *
     *  local = Math.max(local+prices[i+1]-prices[i],0);
     *
     * @param prices
     * @return
     */
    public static int maxSal3(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int local = 0;
        int global = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            local = Math.max(local + prices[i + 1] - prices[i], 0);
            global = Math.max(local, global);
        }
        return global;
    }

    public static int maxSal2(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int buy = arr[0];
        int earn = 0;
        for (int i = 1; i < arr.length; i++) {
            int earnTemp = arr[i] - buy;
            if (earnTemp > earn) {
                earn = earnTemp;
            }
        }
        return earn;
    }

    public static int maxSal(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[j] - arr[i];
                if (temp > max) {
                    max = temp;
                    System.out.println("i=" + arr[i] + ",j=" + arr[j] + ",max=" + max);
                }
            }
        }
        return max;
    }
}
