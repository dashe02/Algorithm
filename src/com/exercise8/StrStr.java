package com.exercise8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/4/16.
 */
public class StrStr {

    //hello ll
    public int strStr(String haystack, String needle) {
        if ("".equals(needle)) {
            return 0;
        }
        int i = 0;
        int j = 0;
        char[] hChar = haystack.toCharArray();
        char[] nChar = needle.toCharArray();
        int[] next = getNext(needle);
        while (i < hChar.length && j < nChar.length) {
            if (j == -1 || hChar[i] == nChar[j]) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (j == needle.length()) {
            return i - needle.length();
        }
        return -1;
    }

    private int[] getNext(String needle) {
        char[] nChar = needle.toCharArray();
        int[] next = new int[nChar.length];
        int j = 0;
        int k = -1;
        next[0] = -1;
        while (j < nChar.length - 1) {
            if (k == -1 || nChar[j] == nChar[k]) {
                j++;
                k++;
                next[j] = k;
            } else {
                k = next[k];
            }
        }
        return next;
    }

    //baaa
    // abbb
    public static void main(String[] args) {
        StrStr s = new StrStr();
        /*String haystack = "hello";
        String needle = "ll";*/
        String haystack = "hello";
        String needle = "ll";
        System.out.print(s.strStr(haystack, needle));
        //System.out.println(haystack.contains(needle));
        //System.out.println(haystack.indexOf(needle));
    }
}
