package com.test.test;

/**
 * Created by wecash on 19/2/25.
 */
public class BinaryFind {

    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3, 5, 7, 9};
        BinaryFind f = new BinaryFind();
        System.out.println(f.binaryFind(array, 9));
        System.out.println(f.binaryFind1(array, 9, 0, array.length - 1));
    }


    private int binaryFind1(int[] array, int key, int low, int high) {
        if (low > high) {
            return -1;
        }
        if (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] > key) {
                return binaryFind1(array, key, low, mid - 1);
            } else if (array[mid] < key) {
                return binaryFind1(array, key, mid + 1, high);
            }
        }
        return -1;
    }

    private int binaryFind(int[] array, int key) {
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
