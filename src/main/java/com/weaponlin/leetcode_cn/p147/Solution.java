package com.weaponlin.leetcode_cn.p147;

import com.weaponlin.pojo.ListNode;

/**
 * TODO
 */
public class Solution {
    /**
     *
     * @param head
     * @return
     */
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;

        while (temp.next != null) {
            ListNode position = findPosition(head, temp.next);
            if (position == head) {
                // insert before head
                ListNode second = position.next;
                ListNode p = temp.next;
                position.next = temp.next.next;
                temp.next = position;
                p.next.next = second;
                head = p;
            } else {

            }
            temp = temp.next;
        }


        return null;
    }

    private ListNode findPosition(ListNode head, ListNode curNode) {
        ListNode tmp = head;
        if (tmp.val > curNode.val) {
            return tmp;
        }
        while (tmp.next != curNode && tmp.next.val <= curNode.val) {
            tmp = tmp.next;
        }
        return tmp;
    }

    /**
     * TODO 利用两个栈
     */
    public ListNode insertionSortList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }


        return null;
    }

    public static void main(String[] args) {

    }
}
