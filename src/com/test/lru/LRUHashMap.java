package com.test.lru;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wecash on 19/3/4.
 */
public class LRUHashMap {

    public Map<String, LRUNode> map = new HashMap<>();

    public LRUNode first;

    public LRUNode end;

    public int capacity;

    public LRUHashMap(int capacity) {
        this.capacity = capacity;
    }

    public void put(String key, String value) {
        LRUNode node = map.get(key);
        if (node == null) {
            if (map.size() > capacity) {
                map.remove(node.key);
                removeLast();
            }
            node = new LRUNode(key, value);
            node.key = key;
        }
        node.val = value;
        moveToHead(node);
        map.put(key, node);
    }

    private void removeLast() {

    }

    public String get(String key) {
        if (map.containsKey(key)) {
            LRUNode node = map.get(key);
            moveToHead(node);
            return node.val;
        }
        return null;
    }

    private void moveToHead(LRUNode node) {

    }

}

