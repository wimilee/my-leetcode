package com.leetcode.wimilee.qt1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author:wimilee
 * @date: 2022/1/30 3:31 AM
 * @description: 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，
 *               使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 *               0 <= nums.length <= 3000
 *               -105 <= nums[i] <= 105
 * @link:
 */
class Solution {
    public List<List<Integer>> threeSum(int [] nums){
        int n = nums.length;
        if (n<3){
            //返回一个空的List,emptyList()不用创建一个新的对象，可以减少内存开销,不能进行增删
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        //各数累加的地方记得去重
        for (int i = 0;i<n-2&&nums[i]<=0;++i){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = n-1;
            while (j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    ++j;
                    --k;
                    while (nums[j]==nums[j-1]){
                        ++j;
                    }
                    while (nums[k]==nums[k+1]){
                        --k;
                    }
                }else if (nums[i]+nums[j]+nums[k]<0){
                    ++j;
                }else {
                    --k;
                }
            }
        }
        return res;
    }
}
