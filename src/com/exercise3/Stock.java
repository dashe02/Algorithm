package com.exercise3;

/**
 * Created by wecash on 19/3/27.
 */
public class Stock {

    public static void main(String[] args) {
        int[] stocks = {7, 6, 4, 3, 1};
        Stock s = new Stock();
        int max = s.moreStock(stocks);
        System.out.print(max);
    }

    private int stock(int[] stocks) {
        int max = 0;
        for (int i = 0; i < stocks.length; i++) {
            int inPrice = stocks[i];
            int temp = 0;
            for (int j = i + 1; j < stocks.length; j++) {
                int outPrice = stocks[j];
                if (outPrice > inPrice) {
                    int diff = outPrice - inPrice;
                    if (diff > temp) {
                        temp = diff;
                    }
                }
            }
            if (max < temp) {
                max = temp;
            }
        }
        return max;
    }

    private int moreStock(int[] stocks) {
        int max = 0;
        int inPrice = stocks[0];
        for (int i = 1; i < stocks.length; i++) {
            int diff = 0;
            int outPrice = stocks[i];
            if (outPrice > inPrice) {
                diff = outPrice - inPrice;
            } else {
                inPrice = stocks[i];
            }
            if (diff > max) {
                max = diff;
            }
        }
        return max;
    }
}
