package com.example.sort;

/**
 * Created by wecash on 19/2/17.
 */
public class QuickSort1 {

    public void quickSort(int[] array, int left, int right) {
        if (left > right) {
            return;
        }
        int i = left;
        int j = right;
        int key = array[left];
        while (i < j) {
            /*j从大往小走，遇到比基准值小的停止*/
            while (i < j && array[j] >= key)
                j--;
            /*i从小往大走，遇到比基准值大的停止*/
            while (i < j && array[i] <= key)
                i++;
            /*i和j没相遇时，则交换*/
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        /*i和j相遇了，把基准值和该点交换*/
        array[left] = array[i];
        array[i] = key;
        quickSort(array, left, i - 1);
        quickSort(array, i + 1, right);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{11, 213, 134, 44, 77, 78, 23, 43};
        QuickSort1 q = new QuickSort1();
        q.quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
