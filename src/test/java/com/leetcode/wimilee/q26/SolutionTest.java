package com.leetcode.wimilee.q26;


import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {
    @Test
    public void test(){
        int[] nums = {1,1,2,3,3,4,5,6,6};
        int count = new Solution().removeDuplicates(nums);
        System.out.println("not duplicate count = " + count);
        System.out.println("nums = " + Arrays.toString(nums));
    }
}