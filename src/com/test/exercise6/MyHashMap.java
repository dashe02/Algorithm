package com.test.exercise6;

/**
 * Created by wecash on 19/4/10.
 */
public class MyHashMap<K, V> {

    MyNode<K, V>[] array;

    int defaultSize = 16;

    double factor = 0.75;

    public MyHashMap() {
        array = new MyNode[defaultSize];
    }

    public V get(K key) {
        int index = indexFor(key, defaultSize);
        MyNode<K, V> node = array[index];
        while (node != null) {
            if (node.key == key || node.key.equals(key)) {
                return node.val;
            } else {
                node = node.next;
            }
        }
        return null;
    }


    private int indexFor(K key, int length) {
        return key.hashCode() % (length - 1);
    }

    public V put(K key, V val) {
        int index = indexFor(key, defaultSize);
        if (index > defaultSize * factor) {
            resize();
        }
        MyNode<K, V> node = array[index];
        if (node == null) {
            array[index] = new MyNode<K, V>(key, val, null);
        } else {
            if (node.key == key || node.key.equals(key)) {
                V oldVal = node.val;
                node.key = key;
                node.val = val;
                return oldVal;
            } else {
                array[index] = new MyNode<K, V>(key, val, node);
            }
        }
        return null;
    }

    private void resize() {
        MyNode<K, V>[] temp = new MyNode[defaultSize * 2];
        MyNode<K, V> node;
        for (int i = 0; i < array.length; i++) {
            node = array[i];
            while (node != null) {
                int newIndex = indexFor(node.key, temp.length);
                MyNode<K, V> next = node.next;
                node.next = temp[newIndex];
                temp[newIndex] = node;
                node = next;
            }
        }
        array = temp;
        defaultSize = temp.length;
        temp = null;
    }
}
