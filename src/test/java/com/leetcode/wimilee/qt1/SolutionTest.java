package com.leetcode.wimilee.qt1;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author:wimilee
 * @date: 2022/1/30 3:53 AM
 * @description:
 * @link:
 */
public class SolutionTest {

    @Test
    public void threeSum() {
        int[] nums = {-1,-2,-2,-1,2,7,3,6,-1,5,4};
        List<List<Integer>> res = new Solution().threeSum(nums);
        System.out.println(res);
    }
}