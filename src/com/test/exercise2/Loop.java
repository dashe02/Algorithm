package com.test.exercise2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/4/3.
 */
public class Loop {

    //3
    //
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        int m = 5;
        Loop loop = new Loop();
        loop.loop(n, k, m);
    }

    private void loop(int n, int k, int m) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        helper(k, m, list);
    }


    private void helper(int k, int m, List<Integer> list) {
        int j = 0;
        while (k <= list.size()) {
            if (list.size() == 1) {
                break;
            }
            k = (k + 1) % list.size();
            if (k == list.size()) {
                k = 1;
            }
            if (j == m) {
                list.remove(k);
                k = m % list.size();
                j = 0;
            }
            j++;
            k++;
        }
        System.out.print(list);
    }
}
