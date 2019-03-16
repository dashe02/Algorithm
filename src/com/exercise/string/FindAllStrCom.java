package com.exercise.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/15.
 */
public class FindAllStrCom {

    public static void main(String[] args) {
        String str = "abc";
        FindAllStrCom f = new FindAllStrCom();
        f.findAllStrCom(str);
    }

    private void findAllStrCom(String str) {
        List<String> res = new ArrayList<>();
        help(0, str.toCharArray(), res);
        System.out.print(res);
    }


    private void help(int i, char[] chars, List<String> res) {
        if (i == chars.length - 1) {
            String str = String.valueOf(chars);
            if (!res.contains(str)) {
                res.add(str);
            }
        } else {
            for (int j = i; j < chars.length; j++) {
                swap(i, j, chars);
                help(i + 1, chars, res);
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
