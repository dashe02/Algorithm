package com.exercise1;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wecash on 19/3/18.
 */
public class FindLongestSubStr {
    public static void main(String[] args) {
        String str = "pwwkew";
        FindLongestSubStr f = new FindLongestSubStr();
        int len = f.findLongestSubStr(str);
        System.out.print(len);
    }

    private int findLongestSubStr(String str) {
        Set<Character> set = new HashSet<>();
        int length = 0;
        int temp = 0;
        for (int i = 0; i < str.length(); ) {
            char c = str.charAt(i);
            if (!set.contains(c)) {
                set.add(c);
                temp++;
                i++;
            } else {
                if (temp >= length) {
                    length = temp;
                }
                set = new HashSet<>();
                temp = 0;
            }
        }
        return length;
    }
}
