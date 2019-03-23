package com.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/22.
 */
public class FindAllCom1 {

    public static void main(String[] args) {
        String str = "abc";
        FindAllCom1 f = new FindAllCom1();
        f.findAllCom1(str);
    }

    private void findAllCom1(String str) {
        List<String> result = new ArrayList<>();
        help(0, str.toCharArray(), result);
        System.out.print(result);
    }


    private void help(int i, char[] chars, List<String> result) {
        if (i == chars.length - 1) {
            String s = new String(chars);
            if (!result.contains(s)) {
                result.add(s);
            }
        } else {
            for (int j = 0; j < chars.length; j++) {
                swap(i, j, chars);
                help(i + 1, chars, result);
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
