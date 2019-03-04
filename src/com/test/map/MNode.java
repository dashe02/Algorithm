package com.test.map;

/**
 * Created by wecash on 19/3/4.
 */
public class MNode<K,V> {

    public K key;

    public V value;

    public MNode<K,V> next;

    public MNode(K key, V value, MNode<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }
}
