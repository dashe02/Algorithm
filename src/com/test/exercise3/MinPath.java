package com.test.exercise3;

/**
 * Created by wecash on 19/3/31.
 */
public class MinPath {

    public static void main(String[] args) {
        int[][] nums = new int[3][3];
        nums[0][0] = 1;
        nums[0][1] = 3;
        nums[0][2] = 1;

        nums[1][0] = 1;
        nums[1][1] = 5;
        nums[1][2] = 1;

        nums[2][0] = 4;
        nums[2][1] = 2;
        nums[2][2] = 1;
        MinPath m = new MinPath();
        int path = m.minPath(nums);
        System.out.print(path);
    }

    private int minPath(int[][] nums) {
        int rows = nums.length;
        int cols = 0;
        if (nums[0] != null) {
            cols = nums[0].length;
        }
        int[][] dp = new int[rows + 1][cols + 1];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = nums[0][0];
                } else if (i == 0) {
                    dp[i][j] = dp[i][j - 1] + nums[i][j];
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + nums[i][j];
                } else {
                    if (dp[i - 1][j] < dp[i][j - 1]) {
                        dp[i][j] = dp[i - 1][j] + nums[i][j];
                    } else {
                        dp[i][j] = dp[i][j - 1] + nums[i][j];
                    }
                }
            }
        }
        return dp[rows - 1][cols - 1];
    }
}
