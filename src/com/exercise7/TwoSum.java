package com.exercise7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wecash on 19/4/13.
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.print(Arrays.toString(result));
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(target - nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null && map.get(nums[i]) != i) {
                return new int[]{map.get(nums[i]), i};
            }
        }
        return new int[0];
    }
}
