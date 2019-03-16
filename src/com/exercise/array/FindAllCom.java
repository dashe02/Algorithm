package com.exercise.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/14.
 */
public class FindAllCom {

    public static void main(String[] args) {
        String str = "abc";
        FindAllCom f = new FindAllCom();
        f.findAllCom(str);
    }

    private void findAllCom(String str) {
        List<String> res = new ArrayList<>();
        help(0, str.toCharArray(), res);
        System.out.println(res);
    }

    private void help(int i, char[] chars, List<String> res) {
        if (i == chars.length - 1) {
            String val = String.valueOf(chars);
            if (!res.contains(val)) {
                res.add(val);
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
