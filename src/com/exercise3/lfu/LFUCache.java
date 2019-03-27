package com.exercise3.lfu;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wecash on 19/3/26.
 */
public class LFUCache<K, V> extends HashMap<K, V> {
    private static final int DEFAULT_MAX_SIZE = 3;
    private int maxSize = DEFAULT_MAX_SIZE;
    Map<K, HitRate> km = new HashMap<K, HitRate>();

    public LFUCache(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public V get(Object key) {
        V v = super.get(key);
        if (v != null) {
            HitRate hitRate = km.get(key);
            hitRate.hitCount += 1;
            hitRate.aTime = System.nanoTime();
        }
        return v;
    }

    public V put(K key, V val) {
        while (km.size() >= maxSize) {
            K k = getLFUAging();
            km.remove(k);
            this.remove(k);
        }
        V v = super.put(key, val);
        km.put(key, new HitRate(key, 1, System.nanoTime()));
        return v;
    }

    private K getLFUAging() {
        HitRate<K, V> hitRate = Collections.min(km.values());
        return hitRate.key;
    }


}
