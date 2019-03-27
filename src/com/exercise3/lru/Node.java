package com.exercise3.lru;

/**
 * Created by wecash on 19/3/26.
 */
public class Node {

    String key;

    String value;

    Node pre;

    Node next;

    public Node(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
