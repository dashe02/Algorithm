package com.example.test;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by wecash on 19/2/24.
 */
public class LRUCacheTest<K, V> extends LinkedHashMap<K, V> {

    private final int MAX_CACHE_SIZE;

    public LRUCacheTest(int cacheSize) {
        super((int) Math.ceil(cacheSize / 0.75) + 1, 0.75f, true);
        MAX_CACHE_SIZE = cacheSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > MAX_CACHE_SIZE;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<K, V> entry : entrySet()) {
            sb.append(String.format("%s,%s", entry.getKey(), entry.getValue()));
        }
        return sb.toString();
    }
}
