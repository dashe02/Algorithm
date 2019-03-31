package com.exercise3;

/**
 * Created by wecash on 19/3/28.
 */
public class MaxProfit {

    public static void main(String[] args) {
        int[] stocks = {1, 3, 2, 8, 4, 9};
        MaxProfit m = new MaxProfit();
        int max = m.maxProfit(stocks);
        System.out.print(max);
    }

    private int maxProfit(int[] stocks) {
        if (stocks == null) return 0;
        if (stocks.length == 0) return 0;
        int max = 0;
        int inPrice = stocks[0];
        for (int i = 1; i < stocks.length; i++) {
            int j = i;
            int temp = 0;
            while (j < stocks.length) {
                if (stocks[j] > inPrice) {
                    temp += stocks[j] - inPrice;
                    j = j + 2;
                }
            }
            if (max < temp) {
                max = temp;
            }
        }
        return max;
    }
}
