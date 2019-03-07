package com.test.test.lru;

import com.example.lru.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wecash on 19/3/7.
 */
public class MyLRUCache {

    Map<Integer, Node> map = new HashMap<>();

    Node head;

    Node tail;

    int capacity;

    public MyLRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        head.pre = null;
        tail.pre = head;
        tail.next = null;
    }

    public void put(Integer key, Integer value) {
        Node node = map.get(key);
        if (node == null) {
            if (map.size() >= capacity) {
                map.remove(tail.pre.key);
                removeLast();
            }
            node = new Node(key, value);
        }
        node.key = key;
        node.value = value;
        moveToFirst(node);
        map.put(key, node);
    }

    // head -> tail -> null
    // head <- tail <- null
    private void removeLast() {
        Node pre = tail.pre;
        tail = pre;
        if (pre == null) {
            head = null;
        } else {
            pre.next = null;
        }
    }

    // node.pre -> node -> node.next
    // node.pre <- node <- node.next
    private void moveToFirst(Node node) {

        node.pre.next = node.next;
        node.next.pre = node.pre;

        //head -> node1
        //head <- node1

        node.next = head.next;
        head.next.pre = node;
        node.pre = head;
        head.next = node;

    }

    public Integer get(Integer key) {
        Node node = map.get(key);
        if (node != null) {
            moveToFirst(node);
            map.put(key, node);
            return node.value;
        }
        return null;
    }


}
