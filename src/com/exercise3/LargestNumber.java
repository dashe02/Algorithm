package com.exercise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by wecash on 19/3/25.
 */
public class LargestNumber {

    public static void main(String[] args) {
        int[] nums = {1, 4, 7, 2, 5, 8, 0, 3, 6, 9};
        // 74125
        //9534330
        //
        LargestNumber l = new LargestNumber();
        String max = l.largestNum1(nums);
        System.out.print(max);
    }

    private String largestNum(int[] nums) {
        if (nums == null) return null;
        if (nums.length == 0) return null;
        if (nums.length == 1) return String.valueOf(nums[0]);
        //Arrays.sort(nums);
        String max = "";
        List<Integer> zero = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero.add(nums[i]);
                continue;
            }
            max = getMax(max, String.valueOf(nums[i]));
        }
        for (int i = 0; i < zero.size(); i++) {
            max += zero.get(i);
        }
        return max;
    }

    private String largestNum1(int[] nums) {
        String[] strArr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strArr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        StringBuilder sb = new StringBuilder();
        //防止测试用例中出现了[0,0,0]的情况，按道理应该返回"0"
        if (strArr[0].equals("0")) {
            return "0";
        }
        for (String temp : strArr) {
            sb.append(temp);
        }
        return sb.toString();
    }

    private String getMax(String s1, String s2) {
        String temp1 = s2 + s1;
        String temp2 = s1 + s2;
        return temp1.compareTo(temp2) >= 0 ? temp1 : temp2;
    }
}
