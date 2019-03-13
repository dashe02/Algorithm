package com.exercise.list;

/**
 * Created by wecash on 19/3/13.
 * 1->2->3->4->5  2  5-2
 * 4->5->1->2->3
 * <p>
 * 1->2->3  k=5     5%3=2
 * 2->3->1
 * <p>
 * <p>
 * 0->1->2  k=4
 * 2->0->1
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

    private Node rotateList(Node node1, int k) {
        if (node1 == null) {
            return null;
        }
        int length = 0;
        Node temp = node1;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        k = k % length;
        if (k == 0) return node1;
        Node fast = node1;
        Node slow = node1;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        Node resultHead = slow.next;
        slow.next = null;
        fast.next = node1;
        return resultHead;
    }
}
