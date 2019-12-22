package com.weaponlin.leetcode_cn.p876;

import com.weaponlin.pojo.ListNode;

public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.middleNode(null));
        System.out.println(solution.middleNode(new ListNode(1)).val);
        System.out.println(solution.middleNode(getNode()).val);
        System.out.println(solution.middleNode(getNode1()).val);
    }

    private static ListNode getNode() {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        head.next = node1;
        node1.next = node2;
        return head;
    }

    private static ListNode getNode1() {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        return head;
    }
}
