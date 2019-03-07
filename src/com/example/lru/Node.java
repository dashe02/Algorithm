package com.example.lru;

/**
 * Created by wecash on 19/2/24.
 */
public class Node {

    public int key;

    public int value;

    public Node pre;

    public Node next;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
