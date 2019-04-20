package com.exercise8;

/**
 * Created by wecash on 19/4/14.
 */
public class MaxProfile {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        MaxProfile m = new MaxProfile();
        int max = m.maxProfit(prices);
        System.out.print(max);
    }

    public int maxProfit(int[] prices) {
        if (prices == null) return 0;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {

        }
        return max;
    }
}
