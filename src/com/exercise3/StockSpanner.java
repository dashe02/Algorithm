package com.exercise3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wecash on 19/3/28.
 */
public class StockSpanner {

    int[] stocks = {100, 80, 60, 70, 60, 75, 85};

    Map<Integer, Integer> stockIndexMap = new HashMap<>();

    public StockSpanner() {
        for (int i = 0; i < stocks.length; i++) {
            stockIndexMap.put(stocks[i], i);
        }
    }

    public int next(int price) {
        int index = stockIndexMap.get(price);
        int count = 1;
        int i = index;
        while (i >= 0) {
            if (i == 0) {
                return 1;
            } else {
                int j = i - 1;
                if (stocks[j] > stocks[index]) {
                    break;
                }
                count++;
                i--;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        StockSpanner stockSpanner = new StockSpanner();
        int[] s = stockSpanner.stocks;
        for (int i = 0; i < s.length; i++) {
            System.out.print(stockSpanner.next(s[i]));
        }
    }
}
