package com.test.exercise7;

import com.exercise.list.Node;

/**
 * Created by wecash on 19/4/12.
 *
 * 链表快速排序
 */
public class ListSort {

    //5 1 4 2 3 7
    public static void main(String[] args) {
        Node n1 = new Node(5);
        Node n2 = new Node(1);
        Node n3 = new Node(4);
        Node n4 = new Node(2);
        Node n5 = new Node(3);
        Node n6 = new Node(7);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        listSort(n1, null);
        while (n1 != null) {
            System.out.print(n1.val);
            n1 = n1.next;
        }
    }

    private static void listSort(Node head, Node tail) {
        if (head != tail) {
            Node pNode = partition(head, tail);
            listSort(head, pNode);
            listSort(pNode.next, tail);
        }
    }


    private static Node partition(Node head, Node tail) {
        if (head == tail)
            return head;
        int val = head.val;
        Node pNode = head;
        Node qNode = head.next;
        while (qNode != tail) {
            if (qNode.val < val) {
                pNode = pNode.next;
                int tempVal = pNode.val;
                pNode.val = qNode.val;
                qNode.val = tempVal;
            }
            qNode = qNode.next;
        }
        int temp = head.val;
        head.val = pNode.val;
        pNode.val = temp;
        return pNode;
    }
}
