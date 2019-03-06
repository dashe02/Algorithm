package com.test.lru;

/**
 * Created by wecash on 19/3/4.
 */
public class LRUNode {

    public String key;

    public String val;

    public LRUNode pre;

    public LRUNode next;

    public LRUNode(String key, String val) {
        this.key = key;
        this.val = val;
    }
}
