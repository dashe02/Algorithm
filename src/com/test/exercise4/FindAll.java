package com.test.exercise4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/4/4.
 */
public class FindAll {

    public static void main(String[] args) {
        String str = "abc";
        FindAll f = new FindAll();
        f.findAll(str);
    }

    private void findAll(String str) {
        List<String> list = new ArrayList<>();
        help(0, str.toCharArray(), list);
        System.out.print(list);
    }

    private void help(int i, char[] chars, List<String> list) {
        if (i == chars.length - 1) {
            String s = new String(chars);
            if (!list.contains(s)) {
                list.add(s);
            }
        } else {
            for (int j = 0; j < chars.length; j++) {
                swap(i, j, chars);
                help(i + 1, chars, list);
                swap(i, j, chars);
            }
        }
    }

    private void swap(int i, int j, char[] chars) {
        char c = chars[i];
        chars[i] = chars[j];
        chars[j] = c;
    }
}
