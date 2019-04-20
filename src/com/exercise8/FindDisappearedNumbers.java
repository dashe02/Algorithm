package com.exercise8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/4/15.
 */
public class FindDisappearedNumbers {

    //4,3,2,7,8,2,3,1
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        int len = nums.length;
        if (max >= nums.length) {
            len = max;
        }
        int[] temp = new int[len + 1];
        //1,2,3,4,7,8
        for (int i = 0; i < nums.length; i++) {
            temp[nums[i]] = nums[i];
        }
        //0,1
        for (int i = 1; i < temp.length; i++) {
            if (temp[i] == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        FindDisappearedNumbers f = new FindDisappearedNumbers();
        System.out.print(f.findDisappearedNumbers(nums));
    }
}
