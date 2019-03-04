package com.test.map;

/**
 * Created by wecash on 19/3/4.
 */
public class MyHashMap<K, V> {

    MNode<K, V>[] array;

    int defaultSize = 16;

    double factor = 0.75;

    int size = 0;

    public MyHashMap() {
        array = new MNode[defaultSize];
    }

    public V get(K key) {
        int index = indexFor(key, defaultSize);
        MNode<K, V> node = array[index];
        while (node != null) {
            if (node.key == key || node.key.equals(key)) {
                return node.value;
            } else {
                node = node.next;
            }
        }
        return null;
    }

    public V put(K key, V value) {
        int index = indexFor(key, defaultSize);
        if (index > defaultSize * factor) {
            resize();
        }
        MNode<K, V> node = array[index];
        if (node == null) {
            array[index] = new MNode<K, V>(key, value, null);
            size++;
        } else {
            if (node.key == key || node.key.equals(key)) {
                V oldValue = node.value;
                node.value = value;
                return oldValue;
            } else {
                array[index] = new MNode<K, V>(key, value, node);
                size++;
            }
        }
        return null;
    }

    private void resize() {
        MNode<K, V>[] temp = new MNode[defaultSize * 2];
        MNode<K, V> node = null;
        for (int i = 0; i < array.length; i++) {
            node = array[i];
            while (node != null) {
                int newIndex = indexFor(node.key, temp.length);
                MNode<K, V> next = node.next;
                node.next = temp[newIndex];
                temp[newIndex] = node;
                node = next;
            }
        }
        array = temp;
        defaultSize = temp.length;
        temp = null;
    }

    public int indexFor(K key, int length) {
        return key.hashCode() % (length - 1);
    }

    public static void main(String[] args) {
        MyHashMap<String, String> map = new MyHashMap<>();
        map.put("1", "1");
        map.put("1", "2");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");
        map.put("5", "5");
        map.put("6", "6");
        map.put("7", "7");
        map.put("8", "8");
        map.put("9", "9");
        map.put("10", "10");
        map.put("11", "11");
        map.put("12", "12");
        map.put("13", "13");
        map.put("14", "14");
        map.put("15", "15");
        map.put("16", "16");
        map.put("17", "17");
        map.put("18", "18");
        map.put("19", "19");
        map.put("20", "20");
        System.out.println(map.get("1"));
        System.out.println(map.get("2"));
        System.out.println(map.get("3"));
        System.out.println(map.get("4"));
        System.out.println(map.get("5"));
        System.out.println(map.get("6"));
        System.out.println(map.get("7"));
        System.out.println(map.get("8"));
        System.out.println(map.get("9"));
        System.out.println(map.get("10"));
        System.out.println(map.get("11"));
        System.out.println(map.get("12"));
        System.out.println(map.get("13"));
        System.out.println(map.get("14"));
        System.out.println(map.get("15"));
        System.out.println(map.get("16"));
        System.out.println(map.get("17"));
        System.out.println(map.get("18"));
        System.out.println(map.get("19"));
        System.out.println(map.get("20"));
    }
}
