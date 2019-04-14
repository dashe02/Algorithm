package com.exercise7;

/**
 * Created by wecash on 19/4/13.
 */
public class KMP {
    public static void main(String[] args) {
        String str = "abcabaabaabcacb";
        String pattern = "abaabcac";
        KMP k = new KMP();
        boolean kmpResult = k.kmp(str, pattern);
        System.out.print(kmpResult);
    }

    private boolean kmp(String str, String pattern) {
        char[] sChar = str.toCharArray();
        int[] next = getNext(pattern);
        char[] pChar = pattern.toCharArray();
        int i = 0;
        int j = -1;
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
        char[] pChar = pattern.toCharArray();
        int j = 0;
        int k = -1;
        int[] next = new int[pChar.length];
        next[0] = -1;
        while (j < pChar.length - 1) {
            if (k == -1 || pChar[j] == pChar[k]) {
                j++;
                k++;
                next[j] = k;
            } else {
                k = next[k];
            }
        }
        return next;
    }
}
