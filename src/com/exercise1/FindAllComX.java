package com.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/21.
 */
public class FindAllComX {

    public static void main(String[] args) {
        String str = "abc";
        FindAllComX f = new FindAllComX();
        List<String> list = f.findAllCom(str);
        System.out.print(list);
    }

    private List<String> findAllCom(String str) {
        List<String> list = new ArrayList<>();
        help(0, str.toCharArray(), list);
        return list;
    }


    private void help(int i, char[] chars, List<String> list) {
        if (i == chars.length - 1) {
            String s = new String(chars);
            if (!list.contains(s)) {
                list.add(s);
            }
        } else {
            for (int j = 0; j < chars.length; j++) {
                swap(i, j, chars);
                help(i + 1, chars, list);
                swap(i, j, chars);
            }
        }
    }

    private void swap(int i, int j, char[] chars) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
