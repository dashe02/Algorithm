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
        // node节点有可能是头节点，尾节点，中间节点三种情况，来处理指针删除
        // 情况1,node是头节点
        if (node == first) return;
        // 情况2,node的前一个节点的next引用指向node的后一个节点
        if (node.pre != null) node.pre.next = node.next;
        // node的后一个节点的pre引用指向node的前一个节点
        if (node.next != null) node.next.pre = node.pre;
        // 情况3,node为尾节点
        if (node == last) last = last.pre;
        // 位移到头节点
        // 第一次put时（即first==null）不需要处理Node的pre和next两个引用
        if (first == null) {
            node.next = first;
            first.pre = node;
        }
        first = node;
        node.pre = null;
        //处理第一次put时，last也指向first
        if (last == null) last = first;
    }

    private void removeLast() {
        if (last != null) {
            Node temp = last.pre;
            // 尾节点的前一个节点next引用移除
            if (last.pre != null) {
                last.pre.next = null;
            }
            // 尾节点移除pre引用
            last.pre = null;
            // 尾指针指向前一个节点
            last = temp;
        }
    }

    private Node getNode(K key) {
        return hashMap.get(key);
    }
}
