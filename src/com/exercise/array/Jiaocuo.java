package com.exercise.array;

/**
 * Created by wecash on 19/3/18.
 */
public class Jiaocuo {

    public static void main(String[] args) {
        String str = "10101";
        Jiaocuo j = new Jiaocuo();
        int length = j.jiaocuo(str);
        System.out.print(length);
    }

    private int jiaocuo(String str) {
        char[] chars = str.toCharArray();
        int i = 0;
        int j = 0;
        int length = 0;
        while (i < chars.length - 1 && j < chars.length) {
            j = i + 1;
            if (chars[i] != chars[j]) {
                length++;
            }
            i++;
        }
        return length + 1;
    }
}
