package com.test.exercise6;

/**
 * Created by wecash on 19/4/10.
 */
public class MyNode<K, V> {

    K key;

    V val;

    MyNode next;

    MyNode pre;

    public MyNode(K key, V val, MyNode next) {
        this.key = key;
        this.val = val;
        this.next = next;
    }
}
