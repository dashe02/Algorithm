package com.test.exercise2;

/**
 * Created by wecash on 19/4/1.
 */
public class FindLongestSubStr {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 4, 7};
        FindLongestSubStr f = new FindLongestSubStr();
        int count = f.findLongestSubStr(nums);
        System.out.print(count);
    }

    private int findLongestSubStr(int[] nums) {
        int len = nums.length;
        int[] length = new int[len];
        int[] count = new int[len];
        int maxLen = 1, res = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (length[i] == length[j] + 1) {
                        count[i] += count[j];
                    } else if (length[i] < length[j] + 1) {
                        length[i] = length[j] + 1;
                        count[i] = count[j];
                    }
                }
            }
            maxLen = Math.max(maxLen, length[i]);
        }
        for (int i = 0; i < len; i++) {
            if (length[i] == maxLen) {
                res += count[i];
            }
        }
        return res;
    }

}
