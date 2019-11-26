package com.weaponlin.leetcode_cn.p129;

import com.weaponlin.pojo.TreeNode;

public class Solution {

    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int val = sum * 10 + root.val;
        if (root.left == null && root.right == null) {
            return val;
        }
        return dfs(root.left, val) + dfs(root.right, val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(0);
        root.left = left;
        root.right = right;
        left.right = new TreeNode(5);
        left.left = new TreeNode(1);

        Solution solution = new Solution();
        System.out.println(solution.sumNumbers(root));
    }
}
