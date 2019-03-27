package com.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wecash on 19/3/26.
 */
public class LFUCache<K, V> extends HashMap<K, V> {

    private int maxSize = 3;
    Map<K, HitRate> hk = new HashMap<K, HitRate>();

    @Override
    public V get(Object key) {
        V v = super.get(key);
        if (v != null) {
            HitRate hitRate = hk.get(key);
            hitRate.rateCount += 1;
            hitRate.aTime = System.nanoTime();
        }
        return v;
    }

    @Override
    public V put(K key, V value) {
        while (maxSize <= hk.size()) {
            K k = getLFUAging();
            hk.remove(k);
            this.remove(k);
        }
        V v = super.put(key, value);
        hk.put(key, new HitRate(key, 1, System.nanoTime()));
        return v;
    }

    private K getLFUAging() {
        HitRate<K, V> min = Collections.min(hk.values());
        return min.key;
    }
}

class HitRate<K, V> implements Comparable<HitRate> {
    K key;
    Integer rateCount;
    Long aTime;

    public HitRate(K key, Integer rateCount, Long aTime) {
        this.key = key;
        this.rateCount = rateCount;
        this.aTime = aTime;
    }

    @Override
    public int compareTo(HitRate o) {
        int r = rateCount.compareTo(o.rateCount);
        return r != 0 ? r : aTime.compareTo(o.aTime);
    }
}