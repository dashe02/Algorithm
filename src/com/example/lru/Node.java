package com.example.lru;

/**
 * Created by wecash on 19/2/24.
 */
public class Node {

    int key;

    int value;

    Node pre;

    Node next;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
