package com.example.lru;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wecash on 19/2/24.
 */
public class LRUCache1<K, V> {

    private Node first;

    private Node last;

    private final int MAX_CACHE_SIZE;

    private Map<K, Node<K, V>> hashMap;

    public LRUCache1(int cacheSize) {
        MAX_CACHE_SIZE = cacheSize;
        hashMap = new HashMap<K, Node<K, V>>();
    }

    public void put(K key, V value) {
        Node node = getNode(key);
        if (node == null) {
            if (hashMap.size() >= MAX_CACHE_SIZE) {
                hashMap.remove(last.key);
                removeLast();
            }
            node = new Node();
            node.key = key;
        }
        node.value = value;
        moveToFirst(node);
        hashMap.put(key, node);
    }

    private V get(K key) {
        Node<K, V> node = getNode(key);
        if (node == null) return null;
        moveToFirst(node);
        return node.value;
    }

    /*2->3->1->5->6*/
    private void moveToFirst(Node node) {
        if (node == first) return;
        if (node.pre != null) node.pre.next = node.next;
        if (node.next != null) node.next.pre = node.pre;
        if (node == last) last = last.pre;
        if (first == null || last == null) {
            first = last = node;
            return;
        }
        node.next = first;
        first.pre = node;
        first = node;
        node.pre = null;
    }

    private void removeLast() {
        if (last != null) {
            last = last.pre;
            if (last == null) first = null;
            else last.next = null;
        }
    }

    private Node getNode(K key) {
        return hashMap.get(key);
    }
}
