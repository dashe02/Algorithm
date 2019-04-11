package com.test.exercise6;

/**
 * Created by wecash on 19/4/10.
 */
public class MinDinstance {

    public int minDistance(String word1, String word2) {
        int rows = word1.length();
        int cols = word2.length();
        int[][] dp = new int[rows + 1][cols + 1];
        for (int i = 1; i <= rows; i++)
            dp[i][0] = i;
        for (int j = 1; j <= cols; j++)
            dp[0][j] = j;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1] + 1,
                            dp[i - 1][j] + 1), dp[i][j - 1] + 1);
                }
            }
        }
        return dp[rows][cols];
    }
}
