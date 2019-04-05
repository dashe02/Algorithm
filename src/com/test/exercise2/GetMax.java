package com.test.exercise2;

/**
 * Created by wecash on 19/4/1.
 */
public class GetMax {

    static int max = 0;

    public static void main(String[] args) {
        int[] nums = {1, 5, 8, 0, 2, 4, 9};
        GetMax g = new GetMax();
        g.getMax0(nums, 0);
        System.out.print(max);
    }


    private void getMax0(int[] nums, int pos) {
        if (pos == nums.length) {
            return;
        }
        if (max < nums[pos]) {
            max = nums[pos];
        }
        getMax0(nums, pos + 1);
    }
}
