package com.exercise5;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wecash on 19/4/8.
 */
public class LinkedHashMapTest {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("2", "2");
        map.put("1", "1");
        map.put("3", "3");
        map.put("4", "4");
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("key:" + entry.getKey() + ",value:" + entry.getValue());
        }
    }
}
