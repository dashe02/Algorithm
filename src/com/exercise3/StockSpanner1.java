package com.exercise3;

/**
 * Created by wecash on 19/3/28.
 */
public class StockSpanner1 {

    /*
    * 1
    * 3 2
    *   8 4 9
    *   4
    *   9
    * 2
    * 8
    * 4
    * 9
    */

    public static void main(String[] args) {
        int[] stocks = {4, 5, 2, 4, 3, 3, 1, 2, 5, 4};
        int fee = 1;
        StockSpanner1 s = new StockSpanner1();
        int temp = s.stockSpanner1(stocks, fee);
        System.out.println(temp);
    }

    private int stockSpanner1(int[] stocks, int fee) {
        int n = stocks.length;
        if (n <= 1) return 0;
        int cash = 0;
        int buy = -stocks[0];
        for (int i = 1; i < stocks.length; i++) {
            cash = Math.max(cash, stocks[i] + buy - fee);
            buy = Math.max(buy, cash - stocks[i]);
        }
        return cash;
    }


}
