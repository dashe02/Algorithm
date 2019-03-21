package com.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/20.
 */
public class FindAllCom {

    public static void main(String[] args) {
        String str = "abc";
        FindAllCom f = new FindAllCom();
        List<String> lists = f.findAllCom(str);
        System.out.print(lists);
    }

    private List<String> findAllCom(String str) {
        List<String> lists = new ArrayList<>();
        char[] charArray = str.toCharArray();
        help(0, charArray, lists);
        return lists;
    }

    private void help(int i, char[] charArray, List<String> lists) {
        if (i == charArray.length - 1) {
            String res = new String(charArray);
            if (!lists.contains(res)) {
                lists.add(res);
            }
        } else {
            for (int j = 0; j < charArray.length; j++) {
                swap(i, j, charArray);
                help(i + 1, charArray, lists);
                swap(i, j, charArray);
            }
        }
    }


    private void swap(int i, int j, char[] charArray) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }


}
