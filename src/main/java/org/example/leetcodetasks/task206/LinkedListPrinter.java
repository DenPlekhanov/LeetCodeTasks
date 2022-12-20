package org.example.leetcodetasks.task206;

public class LinkedListPrinter {
    private LinkedListPrinter() {
    }

    public static void printAllChain(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}