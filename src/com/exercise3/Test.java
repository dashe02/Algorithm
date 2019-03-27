package com.exercise3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by wecash on 19/3/27.
 */
public class Test {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");
        map.put("5", "5");
        map.put("6", "6");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getKey().equals("2")){
                iterator.remove();
            }
        }
        System.out.print(map);
    }
}
