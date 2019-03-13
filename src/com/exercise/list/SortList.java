package com.exercise.list;

/**
 * Created by wecash on 19/3/13.
 */
public class SortList {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(6);
        Node node4 = new Node(3);
        Node node5 = new Node(4);
        Node node6 = new Node(5);
        Node node7 = new Node(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        SortList s = new SortList();
        Node result = s.sortList(node1);
        while (result != null) {
            System.out.print(result.val + "->");
            result = result.next;
        }
    }

    private Node sortList(Node node1) {
        int k = 0;
        int[] array = new int[7];
        while (node1 != null) {
            array[k++] = node1.val;
            node1 = node1.next;
        }
        quickSort(array);
        //1->2
        Node head = new Node(array[0]);
        Node temp = head;
        Node node;
        for (int i = 1; i < array.length; i++) {
            node = new Node(array[i]);
            temp.next = node;
            temp = node;
        }
        return head;
    }

    private void quickSort(int[] array) {
        quickSort0(array, 0, array.length - 1);
    }

    private void quickSort0(int[] array, int left, int right) {
        if (left > right)
            return;
        int i = left;
        int j = right;
        int temp = array[left];
        while (i < j) {
            while (i < j && array[j] >= temp)
                j--;
            while (i < j && array[i] <= temp)
                i++;
            if (i < j) {
                int t = array[i];
                array[i] = array[j];
                array[j] = t;
            }
        }
        array[left] = array[i];
        array[i] = temp;
        quickSort0(array, left, i - 1);
        quickSort0(array, i + 1, right);
    }
}
