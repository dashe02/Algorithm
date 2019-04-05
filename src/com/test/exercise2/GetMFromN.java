package com.test.exercise2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/4/1.
 * 数的组合问题。从1,2,…,n中取出m个数，将所有组合按照字典顺序列出。如n=3,m=2时，输出：12 13 23
 */
public class GetMFromN {

    public static void main(String[] args) {
        int n = 5;
        int m = 2;
        GetMFromN g = new GetMFromN();
        g.getMFromN(n, m);
    }

    private void getMFromN(int n, int m) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        help(n, m, list, lists, 1);
        System.out.print(lists);
    }

    //1 2 3 4 5
    private void help(int n, int m, List<Integer> list, List<List<Integer>> lists, int pos) {
        if (list.size() == m) {
            lists.add(new ArrayList<>(list));
        }
        for (int i = pos; i <= n; i++) {
            list.add(i);
            help(n, m, list, lists, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
