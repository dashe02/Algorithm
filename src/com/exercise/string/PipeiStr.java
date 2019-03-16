package com.exercise.string;

/**
 * Created by wecash on 19/3/15.
 */
public class PipeiStr {

    public static void main(String[] args) {
        String str1 = "abcabaabaabcacb";
        String str2 = "abaabcac";
        PipeiStr p = new PipeiStr();
        boolean isOk = p.KMP(str1, str2);
        System.out.print(isOk);
    }

    private boolean pipeiStr(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        int i = 0, j = 0;
        while (i < chars1.length && j < chars2.length) {
            if (chars1[i] == chars2[j]) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        System.out.print(j);
        return j == str2.length();
    }

    public boolean KMP(String str, String pattern) {
        int[] next = getNext(pattern);
        int i = 0, j = 0;
        char[] chars = str.toCharArray();
        char[] pChar = pattern.toCharArray();
        while (i < chars.length && j < pChar.length) {
            if (j == -1 || chars[i] == pChar[j]) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        return j == pChar.length;
    }

    public int[] getNext(String patternStr) {
        int[] next = new int[patternStr.length()];
        int k = -1;
        int j = 0;
        next[0] = -1;
        char[] pChar = patternStr.toCharArray();
        while (j < patternStr.length() - 1) {
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
