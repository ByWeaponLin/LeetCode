package com.weaponlin.leetcode_cn.p102;

import java.util.*;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> s1 = new LinkedList<>();
        Queue<TreeNode> s2 = new LinkedList<>();
        s1.offer(root);
        while (!s1.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            while (!s1.isEmpty()) {
                TreeNode node = s1.poll();
                level.add(node.val);
                if (node.left != null) {
                    s2.offer(node.left);
                }
                if (node.right != null) {
                    s2.offer(node.right);
                }
            }
            result.add(level);
            Queue<TreeNode> tmp = s1;
            s1 = s2;
            s2 = tmp;
        }

        return result;
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        Stack<Integer> s2 = new Stack<>();
        s2.push(2);
        Stack<Integer> tmp = s1;
        s1 = s2;
        s2 = tmp;

        System.out.println(s1.pop());
        System.out.println(s2.pop());
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
