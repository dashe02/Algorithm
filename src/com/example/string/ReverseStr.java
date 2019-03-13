package com.example.string;

/**
 * Created by wecash on 19/3/10.
 */
public class ReverseStr {

    public static void main(String[] args) {
        String str = "synchronized void printB";
        ReverseStr r = new ReverseStr();
        System.out.print(r.reverseStr(str));
    }

    private String reverseStr(String str) {
        if (str == null || "".equals(str))
            return null;
        String[] strings = str.split(" ");
        int i = 0;
        int j = strings.length - 1;
        while (i < j) {
            String temp = strings[i];
            strings[i] = strings[j];
            strings[j] = temp;
            i++;
            j--;
        }
        str = "";
        for (int k = 0; k < strings.length; k++) {
            str += strings[k] + " ";
        }
        return str;
    }
}
