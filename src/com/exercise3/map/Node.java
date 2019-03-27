package com.exercise3.map;

/**
 * Created by wecash on 19/3/25.
 */
public class Node<K,V> {

    K key;
    V val;
    Node<K,V> next;

    public Node(K key, V val, Node<K, V> next) {
        this.key = key;
        this.val = val;
        this.next = next;
    }
}
