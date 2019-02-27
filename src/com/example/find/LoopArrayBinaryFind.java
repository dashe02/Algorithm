package com.example.find;

/**
 * Created by wecash on 19/2/26.
 * 循环数组的二分查找
 */
public class LoopArrayBinaryFind {

    public static void main(String[] args) {
        int[] array = new int[]{8, 9, 1, 2, 4, 5, 7};
        LoopArrayBinaryFind l = new LoopArrayBinaryFind();
        System.out.println(l.loopArrayBinaryFind(array, 0, array.length - 1, -1));
    }

    private boolean loopArrayBinaryFind(int[] array, int left, int right, int target) {
        if (left > right) return false;
        int mid = left + (right - left) / 2;
        if (array[mid] == target) {
            return true;
        }
        if (array[left] < array[mid] && array[mid] < array[right]) {//普通二分查找
            if (array[mid] < target) {
                return loopArrayBinaryFind(array, mid + 1, right, target);
            } else if (array[mid] > target) {
                return loopArrayBinaryFind(array, left, mid - 1, target);
            }
        } else if (array[left] > array[mid] && array[mid] < array[right]) {//转折点在左侧
            if (target > array[mid] && target <= array[right]) {
                return loopArrayBinaryFind(array, mid + 1, right, target);
            } else {
                return loopArrayBinaryFind(array, left, mid - 1, target);
            }
        } else if (array[left] < array[mid] && array[mid] > array[right]) { //转折点在右侧
            if (target >= array[left] && target < array[mid]) {
                return loopArrayBinaryFind(array, left, mid - 1, target);
            } else {
                return loopArrayBinaryFind(array, mid + 1, right, target);
            }
        } else {
            return loopArrayBinaryFind(array, left, mid - 1, target)
                    || loopArrayBinaryFind(array, mid + 1, right, target);
        }
        return false;
    }
}
