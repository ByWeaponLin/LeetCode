package com.weaponlin.leetcode_cn.p153;

/**
 * https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/submissions/
 */
public class Solution {

    public int findMin(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        if (nums[nums.length - 1] >= nums[0]) {
            return nums[0];
        }
        return doFindMin(0, nums.length - 1, nums);
    }

    private int doFindMin(int start, int end, int[] nums) {
        if (start < end) {
            int mid = (start + end) / 2;
            if (nums[0] > nums[mid]) {
                return doFindMin(start, mid -1, nums);
            } else {
                return doFindMin(mid + 1, end, nums);
            }
        } else {
            if (start < nums.length -1 && nums[start] > nums[start + 1]) {
                return nums[start + 1];
            } else {
                return nums[start];
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(solution.findMin(nums));

        nums = new int[]{6, 7, 0, 1, 2, 3, 4, 5};
        System.out.println(solution.findMin(nums));

        nums = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(solution.findMin(nums));

        nums = new int[]{1};
        System.out.println(solution.findMin(nums));

        nums = new int[]{1, 2};
        System.out.println(solution.findMin(nums));

        nums = new int[]{3, 1, 2};
        System.out.println(solution.findMin(nums));

        nums = new int[]{3, 4, 5, 1, 2};
        System.out.println(solution.findMin(nums));

        nums = new int[]{2, 3, 4, 5, 1};
        System.out.println(solution.findMin(nums));
    }


}
