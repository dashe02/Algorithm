package com.exercise3;

/**
 * Created by wecash on 19/3/25.
 */
public class LongestHuiwenStr {

    public static void main(String[] args) {
        String str = "babad";
        LongestHuiwenStr l = new LongestHuiwenStr();
        System.out.print(l.longestHuiwenStr(str));
    }

    private String longestHuiwenStr(String str) {
        int start = 0;
        int maxLen = 1;
        int n = str.length();
        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j <= i; ++j) {
                if (i - j < 2) {
                    dp[i][j] = (str.charAt(i) == str.charAt(j));
                } else {
                    dp[i][j] = (str.charAt(i) == str.charAt(j)) && dp[j + 1][i - 1];
                }
                if (dp[i][j] && maxLen < i - j + 1) {
                    maxLen = i - j + 1;
                    start = j;
                }
            }
        }
        return str.substring(start, maxLen);
    }
}
