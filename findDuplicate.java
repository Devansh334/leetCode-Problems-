/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

 

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
 

Constraints:

1 <= n <= 105
nums.length == n + 1
1 <= nums[i] <= n
All the integers in nums appear only once except for precisely one integer which appears two or more times.
 
*/

class Solution {
    public int findDuplicate(int[] nums) {
           int x=0;
        int max=nums[0];
        int min=nums[0];
        int n=nums.length;

        try{
       //Minimum of nums
        for(int i=1;i<n;i++){
            if(min>nums[i]){
                min=nums[i];
            }
        }
    // increment by min number ie -(-min)
        for(int i=0;i<n;i++){
            nums[i]=nums[i]-min;
        }
        // Maximum of nums
        for(int i=1;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        // counting array with index max
       int[] arr =new int[max+1];

    //initializing counting array by 0
        for(int i=0;i<=max;i++){
            arr[i]=0;
        }
    //counting values of nums in arr
        for(int i=0;i<n;i++){
            arr[nums[i]]++;
        }
        //checking which value occurs single time using counting array
        for(int i=0;i<=max;i++){
            if(arr[i]>1){
                x=i;
            }
        }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        //return count index with decrement in by min ie +(-min)
        return x+min;
    }
}

