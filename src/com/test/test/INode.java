package com.test.test;

/**
 * Created by wecash on 19/2/27.
 */
public class INode<K,V> {

    K key;

    V value;

    INode next;

    public INode(K key, V value, INode next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }
}
