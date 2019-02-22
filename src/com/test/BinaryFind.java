package com.test;

/**
 * Created by wecash on 19/2/22.
 */
public class BinaryFind {

    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 7, 9, 10, 12};
        BinaryFind b = new BinaryFind();
        //System.out.println(b.binaryFind1(array, 12));
        System.out.println(b.binaryFind2(array, 7, 0, array.length));
    }

    private int binaryFind2(int[] array, int key, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (array[mid] == key) {
            return mid;
        } else if (array[mid] > key) {
            return binaryFind2(array, key, low, mid - 1);
        } else if (array[mid] < key) {
            return binaryFind2(array, key, mid + 1, high);
        }
        return -1;
    }

    private int binaryFind1(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] > key) {
                high = mid - 1;
            } else if (array[mid] < key) {
                low = mid + 1;
            }
        }
        return -1;
    }
}
