package org.example.leetcodetasks.task206_easy;

public class Main206 {
    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        LinkedListPrinter.printAllChain(node1);

        Solution206 solution206 = new Solution206();
        LinkedListPrinter.printAllChain(solution206.reverseList(node1));
    }
}