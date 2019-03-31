package com.exercise3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wecash on 19/3/27.
 */
public class FindFirstFromArray {

    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 2, 7, 8, 0};
        FindFirstFromArray f = new FindFirstFromArray();
        f.findFirstFromArray(nums);
    }

    private void findFirstFromArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int res = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] > nums[i]) {
                    res = nums[j];
                    break;
                }
            }
            map.put(nums[i], res);
        }
        System.out.print(map);
    }
}
