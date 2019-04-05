package com.test.exercise2;

/**
 * Created by wecash on 19/4/1.
 * dp
 * 4     1
 * 5     2
 * 7     3
 * 1     1
 * 3     2
 * 9     4
 * 求最大递增子串长度
 */
public class LongestSubStr {
    public static void main(String[] args) {
        int[] nums = {4, 5, 7, 1, 3, 9};
        LongestSubStr l = new LongestSubStr();
        int count = l.longestSubStr(nums);
        System.out.print(count);
    }

    private int longestSubStr(int[] nums) {
        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j <= i; j++) {
                if (nums[i] > nums[j] && dp[j] >= dp[i])
                    dp[i] = dp[j] + 1;
            }
        }
        int max = -1;
        for (int i = 0; i < dp.length; i++) {
            if (max < dp[i])
                max = dp[i];
        }
        return max;
    }
}
