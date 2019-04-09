package com.exercise4;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by wecash on 19/4/5.
 */
public class MakeMin {

    public static void main(String[] args) {
        int[] nums = {32, 321,2};
        MakeMin m = new MakeMin();
        String min = m.makeMin(nums);
        System.out.print(min);
    }

    private String makeMin(int[] nums) {
        String[] strings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strings[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1 + o2).compareTo(o2 + o1);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s);
        }
        return sb.toString();
    }
}
