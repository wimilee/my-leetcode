package com.leetcode.wimilee.q26;

/**
 * @author:wimilee
 * @description:给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。你不需要考虑数组中超出新长度后面的元素。
 * @link: &lt;a href="https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/">&lt;/a>
 */

class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;

    }

}
