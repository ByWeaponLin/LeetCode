package com.weaponlin.leetcode_cn.p42;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 * https://leetcode-cn.com/problems/trapping-rain-water/
 */
public class Solution {
    public int trap(int[] height) {
        if (height == null || height.length <= 2) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < height.length - 1; ) {
            if (i < height.length - 1 && height[i + 1] >= height[i]) {
                i++;
                continue;
            }
            if (i == height.length - 2) {
                break;
            }
            int tmp = height[i];
            List<Integer> list = new ArrayList<>();
            list.add(tmp);
            for (; i < height.length - 1;) {
                list.add(height[++i]);
                if (height[i] >= tmp) {
                    break;
                }
            }
            sum += getRain(list);
        }
        return sum;
    }

    private int getRain(List<Integer> list) {
        int size = list.size();
        int min = Integer.min(list.get(0), list.get(size - 1));
        return list.stream().filter(e -> e < min).mapToInt(e -> min - e).sum();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int trap = solution.trap(arr);
        System.out.println(trap);

        arr = new int[]{5, 2, 1, 2, 1, 5};
        trap = solution.trap(arr);
        System.out.println(trap);

        arr = new int[]{5, 1, 1, 5};
        trap = solution.trap(arr);
        System.out.println(trap);
    }
}
