package com.exercise3.lfu;

/**
 * Created by wecash on 19/3/26.
 */
public class HitRate<K, V> implements Comparable<HitRate> {

    K key;

    Integer hitCount; //命中次数

    Long aTime;   //上次命中时间

    public HitRate(K key, Integer hitCount, Long aTime) {
        this.key = key;
        this.hitCount = hitCount;
        this.aTime = aTime;
    }

    @Override
    public int compareTo(HitRate o) {
        int hr = hitCount.compareTo(o.hitCount);
        return hr != 0 ? hr : aTime.compareTo(o.aTime);
    }
}
