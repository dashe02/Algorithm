package com.example.list;

/**
 * Created by wecash on 19/3/4.
 * 1->2->3->5->2->3->5
 */
public class ListIsLoop {

    public Node listIsLoop(Node head) {
        Node slow = head;
        Node fast = head;
        boolean isLoop = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow.val == fast.val) {
                isLoop = true;
                break;
            }
        }
        if (isLoop) {
            slow = head;
            while (fast != null && fast.next != null) {
                if (slow.val == fast.val) {
                    return slow;
                }
                slow = slow.next;
                fast = fast.next;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(5);
        Node n5 = new Node(2);
        Node n6 = new Node(3);
        Node n7 = new Node(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        ListIsLoop loop = new ListIsLoop();
        System.out.println(loop.listIsLoop(n1).val);
    }
}
