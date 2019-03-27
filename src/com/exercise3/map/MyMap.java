package com.exercise3.map;

import java.util.Objects;

/**
 * Created by wecash on 19/3/25.
 */
public class MyMap<K, V> {

    Node<K, V>[] array;

    int defaultSize = 16;

    double factor = 0.75;

    int size = 0;

    public MyMap() {
        array = new Node[defaultSize];
    }

    public V put(K key, V val) {
        int index = indeFor(key, defaultSize);
        if (size > defaultSize * factor) {
            resize();
        }
        Node<K, V> node = array[index];
        if (node == null) {
            node = new Node<K, V>(key, val, null);
            array[index] = node;
        } else {
            if (node.key == key || node.key.equals(key)) {
                V oldVal = node.val;
                node.key = key;
                node.val = val;
                return oldVal;
            } else {
                Node<K, V> newNode = new Node<K, V>(key, val, node);
                array[index] = newNode;
            }
        }
        size++;
        return null;
    }

    //3->7
    private void resize() {
        Node<K, V>[] temp = new Node[defaultSize * 2];
        Node<K, V> node = null;
        for (int i = 0; i < array.length; i++) {
            node = array[i];
            while (node != null) {
                int index = indeFor(node.key, temp.length);
                Node<K, V> next = node.next;
                node.next = temp[index];
                temp[index] = node;
                node = next;
            }
        }
        array = temp;
        defaultSize = temp.length;
        temp = null;
    }

    public V get(K key) {
        int index = indeFor(key, defaultSize);
        Node<K, V> node = array[index];
        while (node != null) {
            if (node.key == key || node.key.equals(key)) {
                return node.val;
            } else {
                node = node.next;
            }
        }
        return null;
    }


    private int indeFor(K key, int length) {
        return key.hashCode() % (length - 1);
    }

}
