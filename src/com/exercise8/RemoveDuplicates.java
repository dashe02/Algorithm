package com.exercise8;

import java.util.Arrays;

/**
 * Created by wecash on 19/4/20.
 */
public class RemoveDuplicates {
    //1 1 2
    public int removeDuplicates(int[] nums) {
        if (nums == null) return 0;
        if (nums.length == 0) return 0;
        int count = 0;
        int k = 0;
        for (int i = 0; i < nums.length; ) {
            int j = i;
            nums[k++] = nums[j];
            while (j < nums.length && nums[i] == nums[j]) {
                j++;
            }
            count++;
            i = j;
        }
        for (int i = count; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        RemoveDuplicates r = new RemoveDuplicates();
        int count = r.removeDuplicates(nums);
        System.out.print(count);
    }
}
