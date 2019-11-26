package com.weaponlin.leetcode_cn.p74;

/**
 * TODO
 * https://leetcode-cn.com/problems/search-a-2d-matrix/
 */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int idx = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (target < matrix[i][idx]) {
                if (idx == 0) {
                    return false;
                }
                idx = getLastLessThanEqualIndex(matrix[i], 0, idx, target);
            } else if (target > matrix[i][idx]) {
                if (idx >= matrix[i].length - 1) {
                    return false;
                }
                idx = getLastLessThanEqualIndex(matrix[i], idx, matrix[i].length, target);
            } else {
                return true;
            }
        }
        return false;
    }

    public int getLastLessThanEqualIndex(int[] array, int begin, int end, int target) {
        if (begin < end) {
            int mid = (begin + end) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                return getLastLessThanEqualIndex(array, mid + 1, end, target);
            } else {
                return getLastLessThanEqualIndex(array, begin, mid - 1, target);
            }
        } else {
            if (array[end] > target) {
                return end - 1;
            } else {
                return end;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] arr = new int[]{1, 3, 5, 7};
//        System.out.println(solution.getLastLessThanEqualIndex(arr, 0, 3, 3));
//        System.out.println(solution.getLastLessThanEqualIndex(arr, 0, 5, 3));
//        System.out.println(solution.getLastLessThanEqualIndex(arr, 0, 5, 7));


        int[][] arr = new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };
        System.out.println(solution.searchMatrix(arr, 3));
        System.out.println(solution.searchMatrix(arr, 20));
        System.out.println(solution.searchMatrix(arr, 12));
        System.out.println(solution.searchMatrix(arr, 35));
    }
}
