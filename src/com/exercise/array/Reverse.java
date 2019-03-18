package com.exercise.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by wecash on 19/3/18.
 */
public class Reverse {

    public static void main(String[] args) {
        String a = "1234";
        Reverse r = new Reverse();
        String result = r.reverse(a);
        System.out.print(result);
    }

    private String reverse(String a) {
        //StringBuilder sb = new StringBuilder();
        //String b;
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            //sb.append(a.charAt(i));
            //sb = sb.reverse();
            list.add(a.charAt(i));
            Collections.reverse(list);
        }
        //b = sb.toString();
        //return b;
        System.out.print(list);
        return null;
    }

}
