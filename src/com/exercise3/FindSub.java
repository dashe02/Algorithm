package com.exercise3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/4/4.
 */
public class FindSub {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        List<String> l = new ArrayList<>();
        print(0, list, l);
    }

    private static void print(int i, List<String> list, List<String> l) {
        if (i > list.size() - 1) {
            System.out.print(l);
        } else {
            l.add(list.get(i));
            print(i + 1, list, l);
            l.remove(list.get(i));
            print(i + 1, list, l);
        }
    }
}
