/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109
*/


class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i = 0;
        int flag = 0;
        while (i < nums.length) {
            if (nums[i] == target) {
                flag = 1;
                break;
            }
            i++;
        }

        if (flag == 0) {
            return new int[]{-1, -1};
        }
        int[] res = new int[2];
        res[0] = i;
        while (i < nums.length && nums[i] == target) {
            i++;
        }
        res[1] = i - 1;

        return res;
    }
}