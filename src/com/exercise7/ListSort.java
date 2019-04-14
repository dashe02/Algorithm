package com.exercise7;

import com.exercise.list.Node;

/**
 * Created by wecash on 19/4/13.
 */
public class ListSort {
    public static void main(String[] args) {
        Node n1 = new Node(5);
        Node n2 = new Node(1);
        Node n3 = new Node(4);
        Node n4 = new Node(3);
        Node n5 = new Node(6);
        Node n6 = new Node(0);
        Node n7 = new Node(9);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        listSort(n1, null);
        while (n1 != null) {
            System.out.print(n1.val);
            n1 = n1.next;
        }
    }

    private static void listSort(Node begin, Node end) {
        if (begin != end) {
            Node pNode = partition(begin, end);
            listSort(begin, pNode);
            listSort(pNode.next, end);
        }
    }


    private static Node partition(Node begin, Node end) {
        if (begin == end) return begin;
        int val = begin.val;
        Node pNode = begin;
        Node qNode = begin.next;
        while (qNode != end) {
            if (qNode.val < val) {
                pNode = pNode.next;
                int tempVal = pNode.val;
                pNode.val = qNode.val;
                qNode.val = tempVal;
            }
            qNode = qNode.next;
        }
        int temp = begin.val;
        begin.val = pNode.val;
        pNode.val = temp;
        return pNode;
    }
}
