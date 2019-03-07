package com.example.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/6.
 */
public class LuckPrice {

    public static void main(String[] args) {
        int price = 1409;

        List<Integer> unLuckNumbers = new ArrayList<Integer>();
        unLuckNumbers.add(1);
        unLuckNumbers.add(4);
        unLuckNumbers.add(7);
        unLuckNumbers.add(8);
        unLuckNumbers.add(9);

        LuckPrice l = new LuckPrice();

        System.out.print(l.luckPrice(price, unLuckNumbers));
    }


    private int luckPrice(int price, List<Integer> unLuckNumbers) {
        String priceStr = String.valueOf(price);
        char[] chars = priceStr.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for (char c : chars) {
            int cI = Integer.parseInt(c + "");
            if (cI == 0) {
                sb.append("2");
            }
            if (unLuckNumbers.contains(cI)) {
                int t = cI;
                if (cI + 1 < 10) {
                    t = t + 1;
                } else {
                    flag = true;
                }
                sb.append(t);
            }
        }
        int p = Integer.parseInt(sb.toString());
        if (flag) {
            p += 3;
        }
        return p;
    }
}
