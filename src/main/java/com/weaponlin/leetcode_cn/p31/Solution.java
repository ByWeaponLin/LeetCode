package com.weaponlin.leetcode_cn.p31;

/**
 * TODO
 * https://leetcode-cn.com/problems/next-permutation/
 */
public class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        if (nums.length <= 2) {
            swap(nums, 0, 1);
            return;
        }

        for (int i = nums.length - 1; i >= 1; i--) {
            if (nums[i - 1] >= nums[i]) {
                if (i == 1) {
                    swap(nums);
                    return;
                }
            } else {
                int j = nums.length - 1;
                while (nums[i - 1] >= nums[j]) {
                    j--;
                }
                swap(nums, i - 1, j);
                swapAll(nums, i, nums.length - 1);
                return;
            }
        }
    }

    private void swapAll(int[] nums, int start, int end) {
        int mid = (start + end) / 2;
        for (int i = start; i <= mid; i++) {
            swap(nums, i, end - (i - start));
        }
    }

    private void swap(int[] nums) {
        int mid = nums.length / 2;
        for (int i = 0; i < mid; i++) {
            swap(nums, i, nums.length - i - 1);
        }
    }

    private void swap(int[] nums, int idx1, int idx2) {
        if (idx1 == idx2) {
            return;
        }
        nums[idx1] ^= nums[idx2];
        nums[idx2] ^= nums[idx1];
        nums[idx1] ^= nums[idx2];
    }

    public static void main(String[] args) {
        // 15435     12345
        Solution solution = new Solution();
        int[] arr = new int[]{1, 2};
        solution.nextPermutation(arr);
        print(arr);

        arr = new int[]{1, 3, 2};
        solution.nextPermutation(arr);
        print(arr);

        arr = new int[]{5, 4, 3, 2, 1};
        solution.nextPermutation(arr);
        print(arr);

        arr = new int[]{1, 1, 5};
        solution.nextPermutation(arr);
        print(arr);

        arr = new int[]{2, 4, 3, 2};
        solution.nextPermutation(arr);
        print(arr);

        arr = new int[]{5, 4, 7, 5, 3, 2};
        solution.nextPermutation(arr);
        print(arr);
    }

    private static void print(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println();
    }
}
