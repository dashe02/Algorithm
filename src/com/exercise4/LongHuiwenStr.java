package com.exercise4;

/**
 * Created by wecash on 19/4/5.
 */
public class LongHuiwenStr {

    public static void main(String[] args) {
        String str = "ababd";
        LongHuiwenStr l = new LongHuiwenStr();
        int len = l.longHuiwenStr(str);
        System.out.print(len);
    }

    private int longHuiwenStr(String str) {
        int n = str.length();
        int maxLen = 1;
        int start = 0;
        boolean[][] dp = new boolean[n + 1][n + 1];
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
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
        System.out.print(str.substring(start,maxLen));
        return str.substring(start, maxLen).length();
    }
}
