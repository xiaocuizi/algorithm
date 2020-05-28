package com.gemini.动态规划;

/**
 * 假设有25分，20分，5分，1分的硬币，现在要给客户41分零钱，如如何办到硬币数最小
 * <p>
 * - 假设dp(n) 是凑到 n 分需要多少个硬币数
 * - 如果第 1 次选择了 25 分的硬币，那么dp(n) = dp(n-25) +1
 * - 如果第 2 次选择了 20 分的硬币，那么dp(n) = dp(n-20) +1
 * - 如果第 3 次选择了 5 分的硬币，那么dp(n) = dp(n-5) +1
 * - 如果第 4 次选择了 1 分的硬币，那么dp(n) = dp(n-1) +1
 * - 所以，dp(n) = min{dp(n-25),dp(n-20),dp(n-5)，dp(n-1)} + 1
 * <p>
 * // dp(41) = 凑够dp(41)需要的最少硬币数量
 * // dp(41-1) = 凑够dp(40)需要的最少硬币数量
 * // dp(41-5) = 凑够dp(36)需要的最少硬币数量
 * // dp(41-20) = 凑够dp(21)需要的最少硬币数量
 * // dp(41-25) = 凑够dp(16)需要的最少硬币数量
 * // min{dp(40),dp(36),dp(21),dp(16)} +1
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/12 10:53
 */
public class 零钱兑换问题 {
    public static void main(String[] args) {



        System.out.println(coins3(19));
    }


    /**
     * 递推
     * 自底向上
     *
     * @param n
     * @return
     */
    static int coins3(int n) {
        // 递归基  (也就是结束条件)
        if (n < 1) {
            return -1;
        }
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            // dp[i] = Min{dp[i-25],dp[i-20],dp[i-5],dp[i-1]} +1;
            // int min = Integer.MAX_VALUE;
            // min = Math.min(dp[i-25],min);
            // min = Math.min(dp[i-20],min);
            // min = Math.min(dp[i-5],min);
            // min = Math.min(dp[i-1],min);
            // dp[i] = min +1;
            int min = Integer.MAX_VALUE;
            if (i >= 1) { min = Math.min(dp[i - 1], min);}
            // min = dp[i - 1];
            if (i >= 5) { min = Math.min(dp[i - 5], min);}
            if (i >= 20) { min = Math.min(dp[i - 20], min);}
            if (i >= 25) { min = Math.min(dp[i - 25], min);}
            dp[i] = min + 1;
        }
        return dp[n];
    }


    // 记忆化搜索
    static int coins2(int n) {
        // 递归基  (也就是结束条件)
        if (n < 1) {
            return -1;
        }

        int[] dp = new int[n + 1];
        // 初始化
        int[] faces = {1, 5, 20, 25};
        for (int face : faces) {
            if (n < face) {
                break;
            }
            // 初始状态
            dp[face] = 1;
        }
        // dp[25] = dp[20] = dp[5] = dp[1] = 1; // 可能越界
        return coins2(n, dp);
    }

    static int coins2(int n, int[] dp) {
        if (n < 1) {
            return Integer.MAX_VALUE;
        }
        if (dp[n] == 0) {
            int min1 = Math.min(coins2(n - 25, dp), coins2(n - 20, dp));
            int min2 = Math.min(coins2(n - 5, dp), coins2(n - 1, dp));
            dp[n] = Math.min(min1, min2) + 1;
        }

        return dp[n];
    }


    /**
     * 暴力递归   自顶向下
     * 有重叠子问题
     *
     * @param n
     * @return
     */
    static int coins(int n) {
        // 递归基  (也就是结束条件)
        if (n < 1) {
            return Integer.MAX_VALUE;
        }
        // 也就是说相等话，一枚硬币就足够了
        if (n == 25 || n == 20 || n == 5 || n == 1) {
            return 1;
        }
        int min1 = Math.min(coins(n - 25), coins(n - 20));
        int min2 = Math.min(coins(n - 5), coins(n - 1));
        return Math.min(min1, min2) + 1;
    }
}
