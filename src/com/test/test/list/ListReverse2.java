package com.test.test.list;

/**
 * Created by wecash on 19/2/25.
 * 1 -> 2 -> 5 ->0 ->3 ->7 ->6
 * 2 -> 1 -> 5 ->0 ->3 ->7 ->6
 * 5 -> 2 -> 1 ->0 ->3 ->7 ->6
 * 0 -> 5 -> 2 ->1 ->3 ->7 ->6
 * 3 -> 0 -> 5 ->2 ->1 ->7 ->6
 * 7 -> 3 -> 0 ->5 ->2 ->1 ->6
 * 6 -> 7 -> 3 ->0 ->5 ->2 ->1
 */
public class ListReverse2 {

    public static void main(String[] args) {
        Node2 root = new Node2(1);
        Node2 n1 = new Node2(2);
        Node2 n2 = new Node2(5);
        Node2 n3 = new Node2(0);
        Node2 n4 = new Node2(3);
        Node2 n5 = new Node2(7);
        Node2 n6 = new Node2(6);

        root.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        ListReverse2 listReverse2 = new ListReverse2();
        System.out.println(listReverse2.reverseList(root).value);
    }

    private Node2 reverseList(Node2 root) {
        if (root == null) return null;
        Node2 reverseNode = null;
        Node2 pre = null;
        Node2 currentNode = root;
        while (currentNode != null) {
            Node2 nextNode = currentNode.next;
            if (nextNode == null) {
                reverseNode = currentNode;
            }
            currentNode.next = pre;
            pre = currentNode;
            currentNode = nextNode;
        }
        return reverseNode;
    }
}
