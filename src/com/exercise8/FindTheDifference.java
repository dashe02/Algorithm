package com.exercise8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/4/15.
 */
public class FindTheDifference {
    //abc abxc
    public char findTheDifference(String s, String t) {
        List<Character> list = new ArrayList<>();
        for (char c : t.toCharArray()) {
            list.add(c);
        }
        for (char c : s.toCharArray()) {
            if (list.contains(c)) {
                list.remove(list.indexOf(c));
            }
        }
        if (list.size() == 0) {
            return '0';
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        FindTheDifference f = new FindTheDifference();
        System.out.print(f.findTheDifference("a", "aa"));
    }
}
