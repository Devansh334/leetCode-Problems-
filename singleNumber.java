/*
 
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 

Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.

 */

class Solution {
    // Using Counting Array
    public int singleNumber(int[] nums) {
        int x = 0;
        int max = nums[0];
        int min = nums[0];
        int n = nums.length;

        try {
            // Minimum of nums
            for (int i = 1; i < n; i++) {
                if (min > nums[i]) {
                    min = nums[i];
                }
            }
            // increment by min number ie -(-min)
            for (int i = 0; i < n; i++) {
                nums[i] = nums[i] - min;
            }
            // Maximum of nums
            for (int i = 1; i < n; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }
            // counting array with index max
            int[] arr = new int[max + 1];

            // initializing counting array by 0
            for (int i = 0; i <= max; i++) {
                arr[i] = 0;
            }
            // counting values of nums in arr
            for (int i = 0; i < n; i++) {
                arr[nums[i]]++;
            }
            // checking which value occurs single time using counting array
            for (int i = 0; i <= max; i++) {
                if (arr[i] == 1) {
                    x = i;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // return count index with decrement in by min ie +(-min)
        return x + min;

    }
}