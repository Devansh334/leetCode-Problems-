/*
Given an integer array nums, find the subarray with the largest sum, and return its sum.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
 
*/


//MARK: BRUTE SOLUTION
class Solution {
    int maxSum = Integer.MIN_VALUE;

    public void sum(int window, int[] nums) {
        if (window <= 0) {
            return;
        }

        int sum = 0;
        for (int i = 0; i < window; i++) {
            sum += nums[i];
        }

        int maxWindowSum = sum;
        int i = 0, j = window;

        while (j < nums.length) {
            sum = sum - nums[i] + nums[j];
            maxWindowSum = Math.max(maxWindowSum, sum);
            i++;
            j++;
        }

        maxSum = Math.max(maxSum, maxWindowSum);

        sum(window - 1, nums); 
    }

    public int maxSubArray(int[] nums) {
        sum(nums.length, nums);
        return maxSum;
    }
}

//MARK: OPTIMAL (KADANE's ALGORITHM)
class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0 ; i<nums.length ; i++) {
            
            sum = sum + nums[i];
            
            if(maxSum<sum){
                maxSum = sum ;
            }
            if(sum<0){
                sum = 0;
            }

        }

        return maxSum;
    }
}
