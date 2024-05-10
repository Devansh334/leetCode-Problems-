/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
*/

class Solution {

    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n = nums1.length+nums2.length;

        int[] arr = new int[n];
        double median;
        int i,j,k;

        for(i=0,j=0,k=0;i<nums1.length && j<nums2.length ; ){
            if(nums1[i]<nums2[j]){
                arr[k++]=nums1[i++];
            }
            else{
                arr[k++]=nums2[j++];
            }
        }

        while(i<nums1.length){
            arr[k++]=nums1[i++];
        }

        while(j<nums2.length){
            arr[k++]=nums2[j++];
        }

        if(arr.length%2==0){
           double x = arr[n/2]+arr[(n/2)-1];
           median = x/2;

        }
        else{
            median = arr[n/2];
        }
        return median;
    }
}
