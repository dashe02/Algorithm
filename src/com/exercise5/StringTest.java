package com.exercise5;

/**
 * Created by wecash on 19/4/9.
 */
public class StringTest {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        String s = s1 + s2;
        System.out.print(s);
        StringBuilder sb = new StringBuilder();
        sb.append(s1).append(s2).toString();
    }
}
