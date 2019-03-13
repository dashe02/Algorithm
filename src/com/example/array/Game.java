package com.example.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/11.
 */
public class Game {


    public static void main(String[] args) {
        Game g = new Game();
        g.game(10, 5);
    }

    public void game(int n, int m) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        int index = 0;
        while (list.size() > 1) {
            for (int i = 1; i < m; i++) {
                index = (index + 1) % list.size();
            }
            list.remove(index);
        }
        System.out.println(list.get(0));
    }
}
