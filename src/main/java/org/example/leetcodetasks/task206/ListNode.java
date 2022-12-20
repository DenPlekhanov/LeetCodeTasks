package org.example.leetcodetasks.task206;

public class ListNode {
    int val; //default access modifier
    ListNode next; //default access modifier

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}