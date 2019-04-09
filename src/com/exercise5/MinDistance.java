package com.exercise5;

/**
 * Created by wecash on 19/4/7.
 * 思路：
 dp[i][j]指把word1[0..i - 1]转换为word2[0..j - 1] 的最小操作数。
 边界条件：
 dp[i][0] = i; 从长度为 i 的字符串转为空串 要删除 i 次
 dp[0][j] = j. 从空串转为长度为 j 的字符串 要添加 j 次
 一般情况：
 如果word[i - 1] == word2[j - 1]，则dp[i][j] = dp[i - 1][j - 1]，因为不需要进行操作，即操作数为0.
 如果word[i - 1] != word2[j - 1]，则需考虑三种情况，取最小值：
 Replace word1[i - 1] by word2[j - 1]： (dp[i][j] = dp[i - 1][j - 1] + 1 (for replacement));
 Delete word1[i - 1]：                  (dp[i][j] = dp[i - 1][j] + 1 (for deletion));
 Insert word2[j - 1] to word1[0..i - 1]：(dp[i][j] = dp[i][j - 1] + 1 (for insertion)).
 https://www.cnblogs.com/Kobe10/p/6365881.html
 */
public class MinDistance {

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
