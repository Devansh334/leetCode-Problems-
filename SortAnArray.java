/*
Given an array of integers nums, sort the array in ascending order and return it.

You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.

 

Example 1:

Input: nums = [5,2,3,1]
Output: [1,2,3,5]
Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).
Example 2:

Input: nums = [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]
Explanation: Note that the values of nums are not necessairly unique.
 

Constraints:

1 <= nums.length <= 5 * 104
-5 * 104 <= nums[i] <= 5 * 104
*/

class Solution {

public void merge(int[] arr1,int[] arr2,int[] nums,int m1,int m2){
    int i,j,k;
    for(i=0,j=0,k=0;i<m1 && j<m2;){
        if(arr1[i]<arr2[j]){
            nums[k++]=arr1[i++];
        }
        else{
            nums[k++]=arr2[j++];
        }
    }
    while(i<m1){
        nums[k++]=arr1[i++];
    }
    while(j<m2){
        nums[k++]=arr2[j++];
    }
}
    public void divide(int[] nums, int n){
        if(n==1)return;
        int m1=n/2;
        int m2=n-m1;

        int[] arr1= new int[m1];
        int[] arr2= new int[m2];

        for(int i=0;i<m1;i++){
            arr1[i]=nums[i];
        }
        for(int i=0;i<m2;i++){
            arr2[i]=nums[i+m1];
        }

        divide(arr1,m1);
        divide(arr2,m2);
        merge(arr1,arr2,nums,m1,m2);

    }
    public int[] sortArray(int[] nums) {
        
        
        divide(nums,nums.length);
        return nums;
    }
}
