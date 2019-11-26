package com.weaponlin.leetcode_cn.p35;

/**
 * https://leetcode-cn.com/problems/search-insert-position/
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr1 = new int[]{1, 3, 5, 6};
        System.out.println(solution.searchInsert(arr1, 5));
        System.out.println(solution.searchInsert(arr1, 2));
        System.out.println(solution.searchInsert(arr1, 7));
        System.out.println(solution.searchInsert(arr1, 0));
    }
}
