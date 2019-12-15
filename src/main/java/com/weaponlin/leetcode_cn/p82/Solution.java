package com.weaponlin.leetcode_cn.p82;

import com.weaponlin.pojo.ListNode;
import com.weaponlin.utils.ListNodeUtil;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = head;

        

        while(node.next != null) {
            ListNode next = node.next;
            if (node.val == next.val) {
                node.next = next.next;
            } else {
                node = next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNodeUtil.print(solution.deleteDuplicates(null));
        ListNodeUtil.print(solution.deleteDuplicates(getNode0()));
        ListNodeUtil.print(solution.deleteDuplicates(getNode1()));
        ListNodeUtil.print(solution.deleteDuplicates(getNode2()));
        ListNodeUtil.print(solution.deleteDuplicates(getNode3()));
        ListNodeUtil.print(solution.deleteDuplicates(getNode4()));

    }

    private static ListNode getNode0() {
        ListNode head = new ListNode(1);
        return head;
    }

    private static ListNode getNode1() {
        ListNode head = new ListNode(1);
        ListNode l2 = new ListNode(1);
        head.next = l2;
        return head;
    }

    private static ListNode getNode2() {
        ListNode head = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(5);
        head.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        return head;
    }

    private static ListNode getNode3() {
        ListNode head = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(3);
        head.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        return head;
    }

    private static ListNode getNode4() {
        ListNode head = new ListNode(3);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(3);
        head.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        return head;
    }
}
