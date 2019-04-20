package com.exercise8;

/**
 * Created by wecash on 19/4/15.
 */
public class PivotIndex {

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        PivotIndex p = new PivotIndex();
        int index = p.pivotIndex(nums);
        System.out.print(index);
    }

    //1<6
    //8>6
    //8<11
    public int pivotIndex(int[] nums) {
        if (nums == null) return -1;
        if (nums.length == 0) return -1;
        int i = 0;
        int j = nums.length - 1;
        //1
        int lSum = nums[0];
        //6
        int rSum = nums[nums.length - 1];
        boolean left = false;
        boolean right = false;
        while (i < j) {
            if (left) {
                lSum += nums[i];
            }
            if (right) {
                rSum += nums[j];
            }
            if (lSum == rSum) {
                if (j - i > 1 && lSum > 0 && rSum > 0) {
                    return i + 1;
                }
                //1<6
            } else if (lSum < rSum) {
                i++;
                left = true;
                right = false;
            } else {
                j--;
                right = true;
                left = false;
            }
        }
        return -1;
    }
}
