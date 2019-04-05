package com.test.exercise3;

/**
 * Created by wecash on 19/3/31.
 */
public class KMP {

    public static void main(String[] args) {
        String str = "abcabaabaabcacb";
        String pattern = "abaabcac";
        KMP k = new KMP();
        boolean flag = k.kmp(str, pattern);
        System.out.print(flag);
    }

    private boolean kmp(String str, String pattern) {
        int[] next = getNext(pattern);
        char[] sChar = str.toCharArray();
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
        int[] next = new int[pChar.length];
        int i = 0;
        int k = -1;
        next[0] = -1;
        while (i < pChar.length - 1) {
            if (k == -1 || pChar[i] == pChar[k]) {
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
