package com.example.map;

import java.util.Map;

/**
 * Created by wecash on 19/2/21.
 */
public class MyHashMap<K, V> {

    private static int defaultSize = 16;

    private static double factor = 0.75;

    private Node<K, V>[] array;

    private int size;

    public MyHashMap() {
        array = new Node[defaultSize];
    }

    public V get(K k) {
        int index = indexFor(k, defaultSize);
        Node<K, V> node = array[index];
        while (node != null) {
            if (node.k == k) {
                return node.value;
            } else {
                node = node.next;
            }
        }
        return null;
    }

    public V put(K k, V v) {
        int index = indexFor(k, defaultSize);
        if (index > defaultSize * factor) {
            resize();
        }
        Node<K, V> node = array[index];
        if (node == null) {
            array[index] = new Node<K, V>(k, v, null);
            size++;
        } else {
            if (node.k == k || node.k.equals(k)) {
                V oldValue = node.value;
                node.value = v;
                return oldValue;
            } else {
                array[index] = new Node<K, V>(k, v, node);
                size++;
            }
        }
        return null;
    }

    private void resize() {
        Node<K, V>[] temp = new Node[defaultSize * 2];
        Node<K, V> node = null;
        for (int i = 0; i < array.length; i++) {
            node = array[i];
            while (node != null) {
                //重新散列
                int index = indexFor(node.k, temp.length);
                //插入头部
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

    public int indexFor(K k, int length) {
        return k.hashCode() % (length - 1);
    }

    public static void main(String[] args) {
        MyHashMap<String, String> m = new MyHashMap<>();
        m.put("1", "哈哈");
        m.put("1", "哈哈1");
        m.put("2", "哈哈2");
        m.put("3", "哈哈3");
        m.put("4", "哈哈4");
        m.put("5", "哈哈5");
        System.out.println(m.get("1"));
        System.out.println(m.get("2"));
        System.out.println(m.get("3"));
        System.out.println(m.get("4"));
        System.out.println(m.get("5"));
    }
}
