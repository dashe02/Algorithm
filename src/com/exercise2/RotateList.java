package com.exercise2;

import com.exercise.list.Node;

/**
 * Created by wecash on 19/3/23.
 */
public class RotateList {

    public static void main(String[] args) {
        Node node1 = new Node(0);
        Node node2 = new Node(1);
        Node node3 = new Node(2);
        node1.next = node2;
        node2.next = node3;
        RotateList r = new RotateList();
        int k = 4;
        Node newNode = r.rotateList(node1, k);
        while (newNode != null) {
            System.out.print(newNode.val);
            newNode = newNode.next;
        }
    }

    public Node rotateList(Node head, int k) {
        if (head == null) return null;
        int len = 0;
        Node p = head;
        while (p != null) {
            len++;
            p = p.next;
        }
        k = k % len;
        if (k == 0) return head;
        Node fast = head;
        Node slow = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        Node resultHead = slow.next;
        slow.next = null;
        fast.next = head;
        return resultHead;
    }
}
