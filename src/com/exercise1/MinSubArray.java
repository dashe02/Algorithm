package com.exercise1;

import java.util.Stack;

/**
 * Created by wecash on 19/3/22.
 */
public class MinSubArray {
    public int minSubArrayLen(int s, int[] nums) {
        int len = 0;
        for (int k = 0; k < nums.length; k++) {
            int temp = 0;
            Stack<Integer> stack = new Stack<>();
            int i = k;
            int tempVal = 0;
            while (i < nums.length) {
                if (tempVal + nums[i] < s) {
                    stack.push(i);
                    tempVal = tempVal + nums[i];
                    i++;
                } else {
                    if (tempVal + nums[i] == s) {
                        for (int j = 0; j < stack.size(); j++) {
                            System.out.print(nums[stack.get(j)] + " ");
                        }
                        System.out.print(nums[i] + "\n");
                        temp = stack.size() + 1;
                        i++;
                    } else {
                        break;
                    }
                }
            }
            if (len == 0) {
                len = temp;
            } else {
                if (temp > 0 && len > temp) {
                    len = temp;
                }
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        MinSubArray m = new MinSubArray();
        System.out.print(m.minSubArrayLen(target, nums));
    }
}
