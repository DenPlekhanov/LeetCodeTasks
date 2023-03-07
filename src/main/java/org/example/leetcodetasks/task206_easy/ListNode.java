package org.example.leetcodetasks.task206_easy;

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