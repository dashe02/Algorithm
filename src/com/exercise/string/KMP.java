package com.exercise.string;

/**
 * Created by wecash on 19/3/15.
 */
public class KMP {

    public static void main(String[] args) {
        String str = "abcabaabaabcacb";
        String pattern = "abaabcac";
        KMP k = new KMP();
        System.out.print(k.kmp(str, pattern));
    }

    private boolean kmp(String str, String pattern) {
        int[] next = getNext(pattern);
        char[] sChar = str.toCharArray();
        char[] pChar = pattern.toCharArray();
        int i = 0, j = 0;
        while (i < sChar.length && j < pChar.length) {
            if (j == -1 || sChar[i] == pChar[j]) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        return j == pattern.length();
    }

    private int[] getNext(String pattern) {
        char[] chars = pattern.toCharArray();
        int pLen = chars.length;
        int[] next = new int[pLen];
        next[0] = -1;
        int k = -1;
        int i = 0;
        while (i < chars.length - 1) {
            if (k == -1 || chars[i] == chars[k]) {
                i++;
                k++;
                next[i] = k;
            } else {
                k = next[k];
            }
        }
        return next;
    }
}
