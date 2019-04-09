package com.exercise4;

/**
 * Created by wecash on 19/4/5.
 */
public class PrintNNum {

    public static void main(String[] args) {
        int n = 2;
        PrintNNum p = new PrintNNum();
        p.printNum(n);
    }

    private void printNum(int n) {
        int max = 1;
        for (int i = 0; i < n; i++) {
            max *= 10;
        }
        for (int i = 1; i < max; i++) {
            System.out.println(i);
        }
    }
}
