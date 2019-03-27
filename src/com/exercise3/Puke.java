package com.exercise3;

import java.util.LinkedList;

/**
 * Created by wecash on 19/3/27.
 * <p>
 * 1 2 3 4 5 6
 * 34562
 * 5624
 * 246
 * 64
 * 4
 *
 */
public class Puke {
    public static void main(String[] args) {
        System.out.print(getLast());
    }

    private static int getLast() {
        int m = 6;
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= m; i++) {
            list.add(i);
        }
        int count = 1;
        while (list.size() != 1) {
            Integer val = list.get(0);
            if (count % 2 == 1) {
                list.remove(val);
            } else if (count % 2 == 0) {
                list.addLast(val);
                list.remove(val);
            }
            count++;
        }
        return list.get(0);
    }
}
