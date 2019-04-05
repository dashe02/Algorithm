package com.test.exercise3;

/**
 * Created by wecash on 19/4/1.
 * 1 5 11 5
 * 1 5 5 11
 * <p>
 * 1 2 3 5
 */
public class SplitArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5};
        SplitArray s = new SplitArray();
        boolean result = s.splitArray(nums);
        System.out.print(result);
    }

    //1 5 5 11
    private boolean splitArray(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        int t = sum / 2;
        if (sum % 2 != 0)
            return false;
        int[] dp = new int[t + 1];
        for (int i = 0; i < n; i++) {
            for (int j = t; j >= nums[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
            }
        }
        if (dp[t] == t)
            return true;
        return false;
    }
}
