package com.example.find;

/**
 * Created by wecash on 19/2/21.
 */
public class BinaryFind {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5, 7, 9, 11};
        BinaryFind f = new BinaryFind();
        System.out.println(f.binaryFind(array, 1, 0, array.length - 1));
    }

    public int binaryFind(int[] array, int key, int left, int right) {
        int mid = (right + left) / 2;
        if (key < array[mid]) {
            binaryFind(array, key, left, mid - 1);
        } else if (key > array[mid]) {
            binaryFind(array, key, mid + 1, right);
        } else {
            return mid;
        }
        return -1;
    }
}
