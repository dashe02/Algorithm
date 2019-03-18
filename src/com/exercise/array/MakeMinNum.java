package com.exercise.array;

/**
 * Created by wecash on 19/3/18.
 */
public class MakeMinNum {

    public static void main(String[] args) {
        int[] a = {3, 32, 321, 57};
        MakeMinNum m = new MakeMinNum();
        int result = m.makeMinNum(a);
        System.out.print(result);
    }

    private int makeMinNum(int[] a) {
        int temp = a[0];
        for (int i = 1; i < a.length; i++) {
            temp = compareTwo(temp, a[i]);
        }
        return temp;
    }

    private int compareTwo(int temp, int num) {
        String s1 = String.valueOf(temp);
        String s2 = String.valueOf(num);
        String a = s1 + "" + s2;
        String b = s2 + "" + s1;
        String result = a.compareTo(b) <= 0 ? a : b;
        return Integer.parseInt(result);
    }
}
