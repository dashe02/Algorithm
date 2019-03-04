package com.example.string;

/**
 * Created by wecash on 19/3/4.
 */
public class StringMatch {

    public int matchString(String str1, String str2) {
        int i = 0, j = 0;
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        int res = 0;
        while (i < ch1.length && j < ch2.length) {
            res++;
            if (ch1[i] == ch2[j]) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        System.out.println("总共对比了:" + res);
        if (j == ch2.length) {
            return i - j;
        } else {
            return -1;
        }
    }

    public void plain(String str, String patternStr) {
        int strLen = str.length();
        int pLen = patternStr.length();
        int res = 0;
        for (int i = 0; i <= (strLen - pLen); i++) {
            String temp = str.substring(i, i + pLen);
            res++;
            if (temp.equals(patternStr)) {
                System.out.println("匹配成功");
                break;
            }
        }
        System.out.println("一共匹配了:" + res);
    }

    public int KMP(String str, String patternStr) {
        int[] next = getNext(patternStr);
        int i = 0;
        int j = 0;
        char[] sChars = str.toCharArray();
        char[] pChars = patternStr.toCharArray();
        int strLen = sChars.length;
        int pLen = pChars.length;
        int res = 0;
        while (i < strLen && j < pLen) {
            res++;
            if (j == -1 || sChars[i] == pChars[j]) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        System.out.println("总共比较了:" + res);
        if (j == pLen) {
            return i - j;
        } else {
            return -1;
        }
    }

    private int[] getNext(String patternStr) {
        char[] pChar = patternStr.toCharArray();
        int pLen = pChar.length;
        int next[] = new int[pLen];
        int k = -1;
        int j = 0;
        next[0] = -1;
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

    public static void main(String[] args) {
        String str1 = "abcabaabaabcacb";
        String str2 = "abaabcac";
        StringMatch s = new StringMatch();
        //s.plain(str1, str2);
        System.out.println(s.matchString(str1, str2));
        System.out.println("============");
        System.out.println(s.KMP(str1, str2));
        /*int[] indexArray = s.matchString(str1, str2);
        int start = indexArray[1];
        int end = indexArray[0];
        char[] chars = str1.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end + 1; i++) {
            sb.append(chars[i]);
        }
        System.out.println(sb.toString());*/
    }
}
