package com.test.exercise6;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wecash on 19/4/10.
 */
public class LRUCache<K, V> {

    MyNode<K, V> first;

    MyNode<K, V> last;

    Map<K, MyNode> map = new HashMap<K, MyNode>();

    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public V get(K key) {
        MyNode<K, V> myNode = map.get(key);
        if (myNode != null) {
            moveToFirst(myNode);
            return myNode.val;
        }
        return null;
    }

    public void put(K key, V val) {
        if (map.size() >= capacity) {
            removeLast();
        }
        MyNode<K, V> myNode = map.get(key);
        if (myNode == null) {
            myNode = new MyNode<K, V>(key, val, null);
        } else {
            myNode.key = key;
            myNode.val = val;
        }
        moveToFirst(myNode);
        map.put(key, myNode);
    }

    //last->null->head
    private void removeLast() {
        if (last != null) {
            last = last.pre;
            if (last == null) first = null;
            else last.next = null;
        }
    }

    //head->head.next
    //
    private void moveToFirst(MyNode<K, V> myNode) {
        myNode.pre.next = myNode.next;
        myNode.next.pre = myNode.pre;

        myNode.next = first.next;
        first.next = myNode;
        myNode.pre = first;
        first.next.pre = myNode;
    }
}
