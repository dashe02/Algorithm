package com.example.test;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

/**
 * Created by wecash on 19/2/19.
 */
public class Test {

    public void aMethod() {

    }

    public static void main(String[] args) {

        /*String ip = "10.98.96.211";
        List<String> f1 = new ArrayList<>();
        List<String> f2 = new ArrayList<>();
        List<String> f3 = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            int route = i % 1000;
            if (route >= 0 && route < 100) {
                f1.add("1");
            }
            if (route >= 100 && route < 400) {
                f2.add("3");
            }
            if (route >= 400 && route <= 1000) {
                f3.add("6");
            }
        }
        System.out.println(f1.size());
        System.out.println(f2.size());
        System.out.println(f3.size());*/


        PriorityQueue<Integer> queue=new PriorityQueue<>();
        queue.offer(5);
        queue.offer(3);
        queue.offer(4);
        queue.offer(1);
        queue.offer(7);
        queue.offer(9);
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
