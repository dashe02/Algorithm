package com.exercise8;

/**
 * Created by wecash on 19/4/18.
 */
public class MaximumProduct {

    //1,2,3,4
    public int maximumProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -3, -2, -1, 60};
        MaximumProduct m = new MaximumProduct();
        int max = m.maximumProduct(nums);
        System.out.print(max);
    }
}
