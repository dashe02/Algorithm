package com.test;

/**
 * Created by wecash on 19/4/1.
 * <p>
 * 4    1
 * 5    2
 * 7    3
 * 1    1
 * 3    2
 * 9    4
 */
public class LongestSubstr {

    public static void main(String[] args) {
        int[] nums = {4, 5, 7, 1, 3, 9};
        LongestSubstr l = new LongestSubstr();
        int len = l.longestSubStr(nums);
        System.out.print(len);
    }

    private int longestSubStr(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j <= i; j++) {
                if (nums[j] < nums[i] && dp[j] >= dp[i])
                    dp[i] = dp[i] + 1;
            }
        }
        int max = -1;
        for (int i = 0; i < dp.length; i++) {
            if (max < dp[i]) {
                max = dp[i];
            }
        }
        return max;
    }

}
