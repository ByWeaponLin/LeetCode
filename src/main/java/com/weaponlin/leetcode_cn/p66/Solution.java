package com.weaponlin.leetcode_cn.p66;

import com.weaponlin.utils.ArrayUtil;

public class Solution {
    public int[] plusOne(int[] digits) {
        boolean flag = true;
        int len = digits.length;
        int carry = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (flag && digits[i] != 9) {
                flag = false;
            }
            int tmp = digits[i] + carry;
            if (i == len - 1) {
                tmp++;
            }
            carry = tmp / 10;
            digits[i] = tmp % 10;
        }
        if (flag) {
            int[] arr = new int[len + 1];
            arr[0] = 1;
            return arr;
        } else {
            return digits;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[]{1, 2, 3};
        ArrayUtil.print(solution.plusOne(arr));

        arr = new int[]{4, 3, 2, 1};
        ArrayUtil.print(solution.plusOne(arr));

        arr = new int[]{9, 9, 9};
        ArrayUtil.print(solution.plusOne(arr));

        arr = new int[]{8, 9, 9};
        ArrayUtil.print(solution.plusOne(arr));

        arr = new int[]{2, 3, 9, 9};
        ArrayUtil.print(solution.plusOne(arr));
    }
}
