package com.test.exercise4;

import java.util.Stack;

/**
 * Created by wecash on 19/4/4.
 */
public class FindLCS {

    public static void main(String[] args) {
        String s1 = "www.hankcs.com";
        String s2 = "hankcs";
        FindLCS f = new FindLCS();
        int[][] dp = f.findLCS(s1, s2);
        Stack<Character> stack = new Stack<>();
        int i = s1.length() - 1;
        int j = s2.length() - 1;
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

    private int[][] findLCS(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
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
