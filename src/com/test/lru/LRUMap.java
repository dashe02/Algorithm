package com.test.lru;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wecash on 19/3/4.
 */
public class LRUMap {

    public Map<String, LRUNode> map = new HashMap<>();

    public LRUNode head;

    public LRUNode end;

    public int capacity;

    public LRUMap(int capacity) {
        this.capacity = capacity;
    }

    public void put(String key, String value) {
        LRUNode node = map.get(key);
        if (node == null) {
            if (map.size() >= capacity) {
                map.remove(end.key);
                removeLast();
            }
            node = new LRUNode(key, value);
            node.key = key;
        }
        node.val = value;
        moveToFirst(node);
        map.put(key, node);
    }

    private void removeLast() {

    }

    public String get(String key) {
        if (map.containsKey(key)) {
            LRUNode node = map.get(key);
            moveToFirst(node);
            return node.val;
        }
        return null;
    }

    private void moveToFirst(LRUNode node) {

    }
}
