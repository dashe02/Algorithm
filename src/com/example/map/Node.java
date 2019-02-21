package com.example.map;

/**
 * Created by wecash on 19/2/21.
 */
public class Node<K,V> {

    public K k;

    public V value;

    public Node next;

    public Node(K k, V value, Node next) {
        this.k = k;
        this.value = value;
        this.next = next;
    }
}
