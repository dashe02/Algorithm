package com.exercise3;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by wecash on 19/3/25.
 */
public class LargestNum {
    public static void main(String[] args) {
        int[] nums = {1, 4, 7, 2, 5, 8, 0, 3, 6, 9};
        LargestNum l = new LargestNum();
        String max = l.largestNum(nums);
        System.out.print(max);
    }

    private String largestNum(int[] nums) {
        String[] strArray = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strArray[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        StringBuilder sb = new StringBuilder();
        if (strArray[0].equals("0")) {
            return "0";
        }
        for (int i = 0; i < strArray.length; i++) {
            sb.append(strArray[i]);
        }
        return sb.toString();
    }
}
