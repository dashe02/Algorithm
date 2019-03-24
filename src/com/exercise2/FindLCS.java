package com.exercise2;

import java.util.Stack;

/**
 * Created by wecash on 19/3/23.
 */
public class FindLCS {

    public static void main(String[] args) {
        String str1 = "www.hankcs.com";
        String str2 = "hankcs";
        FindLCS f = new FindLCS();
        int[][] dp = f.findLCS(str1, str2);
        Stack<Character> stack = new Stack<>();
        int i = str1.length() - 1;
        int j = str2.length() - 1;
        while (i >= 0 && j >= 0) {
            if (str1.charAt(i) == str2.charAt(j)) {
                stack.push(str1.charAt(i));
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

    private int[][] findLCS(String str1, String str2) {
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp;
    }
}
