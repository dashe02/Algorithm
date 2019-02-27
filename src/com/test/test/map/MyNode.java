package com.test.test.map;

/**
 * Created by wecash on 19/2/27.
 */
public class MyNode<K, V> {

    K key;

    V value;

    MyNode next;

    public MyNode(K key, V value, MyNode next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }
}
