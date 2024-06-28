/*
Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.

You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.

 

Example 1:

Input: nums = [1,2,1,3,2,5]
Output: [3,5]
Explanation:  [5, 3] is also a valid answer.
Example 2:

Input: nums = [-1,0]
Output: [-1,0]
Example 3:

Input: nums = [0,1]
Output: [1,0]
 

Constraints:

2 <= nums.length <= 3 * 104
-231 <= nums[i] <= 231 - 1
Each integer in nums will appear twice, only two integers will appear once.
*/

class Solution {
    public int[] singleNumber(int[] nums) {
     Arrays.sort(nums);
    int[] ans = new int[2];
    int k=0;
     for(int i=0;i<nums.length;i++){
        int count=0;
        int s=0;
        if(i!=0){
            s=i-1;
        }
        for(int j=s;j<nums.length;j++){
            if(nums[i]==nums[j]){
                count++;
            }
        }

        if(count==1){
            ans[k++]=nums[i];
        }
        if(k==2){
            break;
        }
     }
     return ans;   
    }
}
