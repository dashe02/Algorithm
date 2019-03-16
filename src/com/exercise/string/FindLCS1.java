package com.exercise.string;

import java.util.Stack;

/**
 * Created by wecash on 19/3/15.
 */
public class FindLCS1 {

    public static void main(String[] args) {
        String s1 = "www.hankcs.com";
        String s2 = "hankcs";
        FindLCS1 f = new FindLCS1();
        int[][] dp = f.findLCS1(s1, s2);
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        Stack<Character> stack = new Stack<>();
        while (i >= 0 && j >= 0) {
            if (s1.charAt(i) == s2.charAt(j)) {
                stack.push(s1.charAt(i));
                i--;
                j--;
            } else {
                if (dp[i + 1][j] > dp[i][j + 1]) {
                    j--;
                } else {
                    i--;
                }
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }

    private int[][] findLCS1(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp;
    }
}
