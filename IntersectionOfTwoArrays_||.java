/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
 

Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
*/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0,j=0,k=0;
        int[] result=new int[Math.min(nums1.length,nums2.length)];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                result[k++]=nums1[i];
                i++;
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int[] arr=new int[k];
        for(int r=0;r<arr.length;r++){
            arr[r]=result[r];
        }
        return arr;
    }
}
