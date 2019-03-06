package com.example.list;

/**
 * Created by wecash on 19/3/6.
 */
public class ListLoop {
    public static void main(String[] args) {
        Node head = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n4;

        Node f = head;
        Node s = head;

        while (f != null && s != null) {

            if (f != s && f.val == s.val) {
                break;
            }
            f = f.next.next;
            s = s.next;
        }
        //System.out.print(s.val);
    }
}
