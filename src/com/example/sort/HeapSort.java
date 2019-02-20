package com.example.sort;

import java.util.Arrays;

/**
 * Created by wecash on 19/2/20.
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] array = new int[]{};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void heapSort(int[] array) {
        //1.构建大顶堆
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            adjustHeap(array, i, array.length);
        }
        //2.调整堆结构+交换堆顶元素与末尾元素
        for (int j = array.length - 1; j >= 0; j--) {
            swap(array, 0, j);  //将堆顶元素与末尾元素交换
            adjustHeap(array, 0, j); //重新对堆进行调整
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    private static void adjustHeap(int[] array, int i, int length) {
        int temp = array[i]; //先取出当前元素
        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) { //从i节点的左节点开始，也就是2i+1开始
            if (k + 1 < length && array[k] < array[k + 1]) { //如果左子节点小于右子节点，k指向右子节点
                k++;
            }
            if (array[k] > temp) { //如果子节点大于父节点，将子节点值赋给父节点(不用进行交换)
                array[i] = array[k];
                i = k;
            } else {
                break;
            }
        }
        array[i] = temp;    //将temp放到最终的位置
    }

}
