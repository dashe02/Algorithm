package com.exercise3.lru;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wecash on 19/3/26.
 */
public class LRUCache {

    Map<String, Node> map = new HashMap<>();

    Node first;

    Node tail;

    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public void put(String key, String value) {
        Node node = map.get(key);
        if (node == null) {
            node = new Node(key, value);
            if (capacity <= map.size()) {
                map.remove(tail.key);
                removeLast();
            }
        } else {
            node.key = key;
            node.value = value;
        }
        moveToFirst(node);
        map.put(key, node);
    }

    //tail.pre->tail->null
    //tail.pre<-tail<-null
    private void removeLast() {
        if (tail != null) {
            tail = tail.pre;
            if (tail == null) first = null;
            else tail.next = null;
        }
    }

    public String get(String key) {
        Node node = map.get(key);
        if (node != null) {
            moveToFirst(node);
            return node.value;
        }
        return null;
    }

    //node.pre->node->node.next
    //node.pre<-node<-node.next
    private void moveToFirst(Node node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
        //head->head.next
        //head<-head.next
        node.next = first.next;
        first.next = node;
        node.pre = first;
        first.next.pre = node;
    }

}
