package com.example.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/9.
 */
public class MyStringSplit {

    public static void main(String[] args) {
        String str = "abcde,xxx,kkk,";
        MyStringSplit s = new MyStringSplit();
        System.out.print(s.split(str, "#"));
    }

    private List<String> split(String str, String splitter) {
        List<String> result = new ArrayList<>();
        String temp = "";
        char splitterC = splitter.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i == str.length() - 1) {
                result.add(temp + c);
            }
            if (splitterC == c) {
                result.add(temp);
                temp = "";
                continue;
            }
            temp += c;
        }
        return result;
    }
}
