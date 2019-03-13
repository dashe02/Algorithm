package com.exercise.list;

/**
 * Created by wecash on 19/3/13.
 */
public class RemoveNode {

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
        RemoveNode r = new RemoveNode();
        int count = getCount(node1, 6);
        Node node = r.removeNode(node1, 6);
        for (int i = 1; i < count; i++) {
            node = r.removeNode(node, 6);
        }
        while (node != null) {
            System.out.print(node.val);
            node = node.next;
        }
    }

    private static int getCount(Node node1, int n) {
        Node temp = node1;
        int count = 0;
        while (temp != null) {
            if (temp.val == n) {
                count++;
            }
            temp = temp.next;
        }
        return count;
    }

    private Node removeNode(Node head, int n) {
        Node temp = head;
        int k = 0;
        Node pre = head;
        while (head != null) {
            if (head.val == n) {
                break;
            }
            k++;
            head = head.next;
        }
        for (int i = 1; i < k; i++) {
            pre = pre.next;
        }
        Node next = pre.next.next;
        pre.next = null;
        pre.next = next;
        return temp;

    }

}
