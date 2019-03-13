package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/11.
 */
public class GameTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        //System.out.print(list);
        int index = 0;
        while (list.size() > 1) {
            for (int i = 1; i < 5; i++) {
                index = (index + 1) % list.size();
            }
            list.remove(index);
        }
        System.out.print(list.get(0));
    }
}
