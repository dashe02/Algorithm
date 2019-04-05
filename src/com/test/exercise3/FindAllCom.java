package com.test.exercise3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/31.
 */
public class FindAllCom {

    public static void main(String[] args) {
        String str = "abc";
        FindAllCom f = new FindAllCom();
        f.findAllCom(str);
    }

    private void findAllCom(String str) {
        List<String> lists = new ArrayList<>();
        help(0, str.toCharArray(), lists);
        System.out.print(lists);
    }

    private void help(int i, char[] chars, List<String> lists) {
        if (i == chars.length - 1) {
            String s = new String(chars);
            if (!lists.contains(s)) {
                lists.add(s);
            }
        } else {
            for (int j = 0; j < chars.length; j++) {
                swap(i, j, chars);
                help(i + 1, chars, lists);
                swap(i, j, chars);
            }
        }
    }

    private void swap(int i, int j, char[] chars) {
        char c = chars[i];
        chars[i] = chars[j];
        chars[j] = c;
    }
}
