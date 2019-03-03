package com.example.lru;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wecash on 19/2/28.
 */
public class LRUCache2 {

    int capacity;

    Map<Integer, Node> map = new HashMap<>();

    Node head = null;

    Node end = null;

    public LRUCache2(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            remove(node);
            setHead(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node old = map.get(key);
            old.value = value;
            remove(old);
            setHead(old);
        } else {
            Node created = new Node(key, value);
            if (map.size() > capacity) {
                map.remove(end.key);
                remove(end);
                setHead(created);
            } else {
                setHead(created);
            }
            map.put(key, created);
        }
    }

    private void setHead(Node node) {
        node.next = head;
        node.pre = null;
        if (head != null)
            head.pre = node;
        head = node;
        if (end == null)
            end = head;

    }

    private void remove(Node node) {
        if (node.pre != null) {
            node.pre.next = node.next;
        } else {
            head = node.next;
        }

        if (node.next != null) {
            node.next.pre = node.pre;
        } else {
            end = node.pre;
        }
    }


}
