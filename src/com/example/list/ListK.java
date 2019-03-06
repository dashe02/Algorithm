package com.example.list;

/**
 * Created by wecash on 19/3/6.
 * 1->2->3->4->5->6
 */
public class ListK {

    public static void main(String[] args) {
        int k = 5;
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        Node f = n1;
        Node s = n1;
        for (int i = 0; i < k; i++) {
            f = f.next;
        }
        while (f != null) {
            f = f.next;
            s = s.next;
        }
        System.out.print(s.val);
    }
}
