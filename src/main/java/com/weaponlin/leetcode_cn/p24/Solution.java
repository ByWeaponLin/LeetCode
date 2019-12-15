package com.weaponlin.leetcode_cn.p24;

import com.weaponlin.pojo.ListNode;
import com.weaponlin.utils.ListNodeUtil;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode tmp = head.next;
        head.next = tmp.next;
        tmp.next = head;
        head = tmp;

        ListNode tmpHead = head.next;

        while (tmpHead.next != null) {
            ListNode first = tmpHead.next;
            if (first.next != null) {
                // 可配对
                ListNode second = first.next;
                first.next = second.next;
                second.next = first;
                tmpHead.next = second;
                tmpHead = first;
            } else {
                break;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNodeUtil.print(solution.swapPairs(null));
        ListNodeUtil.print(solution.swapPairs(getNode0()));
        ListNodeUtil.print(solution.swapPairs(getNode1()));
        ListNodeUtil.print(solution.swapPairs(getNode2()));

    }

    private static ListNode getNode0() {
        ListNode head = new ListNode(1);
        return head;
    }

    private static ListNode getNode1() {
        ListNode head = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        head.next = l2;
        l2.next = l3;
        l3.next = l4;
        return head;
    }

    private static ListNode getNode2() {
        ListNode head = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        head.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        return head;
    }
}
