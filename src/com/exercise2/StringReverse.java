package com.exercise2;

/**
 * Created by wecash on 19/3/23.
 */
public class StringReverse {
    public static void main(String[] args) {
        String str = "  hello world!  ";
        StringReverse s = new StringReverse();
        System.out.print(s.reverseWords(str));
    }

    public String reverseWords(String s) {
        if (s == null) return null;
        if ("".equals(s)) return null;
        String[] strings = s.split(" ");
        int i = 0;
        int j = strings.length - 1;
        while (i < j) {
            swap(i, j, strings);
            i++;
            j--;
        }
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < strings.length; k++) {
            String ss = strings[k];
            if (ss.equals("")) {
                continue;
            }
            if (k == strings.length - 1) {
                sb.append(ss);
            } else {
                sb.append(ss).append(" ");
            }
        }
        return sb.toString().trim();
    }

    private void swap(int i, int j, String[] strings) {
        String temp = strings[i];
        strings[i] = strings[j];
        strings[j] = temp;
    }
}
