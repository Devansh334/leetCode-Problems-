/*
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

 

Example 1:

Input: nums = [1,2,3]
Output: 6
Example 2:

Input: nums = [1,2,3,4]
Output: 24
Example 3:

Input: nums = [-1,-2,-3]
Output: -6
 

Constraints:

3 <= nums.length <= 104
-1000 <= nums[i] <= 1000
*/

class Solution {
    public int maximumProduct(int[] nums) {
        int flag=0;
        for(int i=0;i<nums.length-1;i++){
            flag=0;
            for(int j=0;j<nums.length-1-i;j++){
                if((nums[j])>(nums[j+1])){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    flag=1;
                }
                
            }
            if(flag==0){
                break;
            }
        }
        int a= nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        int b=nums[0]*nums[1]*nums[nums.length-1];
        return Math.max(a,b);
    }
}
