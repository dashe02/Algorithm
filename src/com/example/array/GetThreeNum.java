package com.example.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wecash on 19/3/6.
 */
public class GetThreeNum {

    public static void main(String[] args) {
        String str = "abcabdabecc";
        GetThreeNum g = new GetThreeNum();
        System.out.print(g.getThreeNum(str));
    }

    private Map<Character,Integer> getThreeNum(String str) {
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            Integer count = map.get(c);
            if (count != null) {
                if (count == 3) {
                    //return c;
                }
                count++;
            } else {
                count = 1;
            }
            map.put(c, count);
        }
        return map;
    }
}
