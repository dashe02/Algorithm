package com.exercise5;

import java.util.BitSet;

/**
 * Created by wecash on 19/4/11.
 */
public class BitMapTest {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet();
        int[] nums = {};
        for (int i = 0; i < nums.length; i++) {
            if (bitSet.get(nums[i])) {
                System.out.print(nums[i]);
            } else {
                bitSet.set(nums[i]);
            }
        }
    }
}
