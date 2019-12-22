package com.weaponlin.leetcode_cn.p5283;

import com.weaponlin.pojo.ListNode;

public class Solution {

    public int getDecimalValue(ListNode head) {
        if (head == null) {
            return 0;
        }
        ListNode tmp = head;
        int sum = 0;
        while (tmp != null) {
            sum = sum << 1 | tmp.val;
            tmp = tmp.next;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getDecimalValue(null));
        System.out.println(solution.getDecimalValue(getNode()));
        System.out.println(solution.getDecimalValue(getNode1()));
        System.out.println(solution.getDecimalValue(new ListNode(0)));
        System.out.println(solution.getDecimalValue(new ListNode(1)));

    }

    private static ListNode getNode() {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(1);
        head.next = node1;
        node1.next = node2;
        return head;
    }

    private static ListNode getNode1() {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(0);
        ListNode node5 = new ListNode(1);
        ListNode node6 = new ListNode(1);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        return head;
    }
}
