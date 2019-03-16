package com.exercise.string;

/**
 * Created by wecash on 19/3/16.
 */
public class KMPStr {

    public static void main(String[] args) {
        String str = "abcabaabaabcacb";
        String pattern = "abaabcac";
        KMPStr k = new KMPStr();
        System.out.print(k.kmpStr(str, pattern));
    }

    private boolean kmpStr(String str, String pattern) {
        int[] next = getNext(pattern);
        int i = 0;
        int j = 0;
        char[] sChar = str.toCharArray();
        char[] pChar = pattern.toCharArray();
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
        int pLen = pattern.length();
        int[] next = new int[pLen];
        int j = 0;
        int k = -1;
        next[0] = -1;
        char[] pChar = pattern.toCharArray();
        while (j < pLen - 1) {
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
