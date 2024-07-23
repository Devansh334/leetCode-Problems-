/*
Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.

Return the sorted array.

 

Example 1:

Input: nums = [1,1,2,2,2,3]
Output: [3,1,1,2,2,2]
Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
Example 2:

Input: nums = [2,3,1,3,2]
Output: [1,3,3,2,2]
Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.
Example 3:

Input: nums = [-1,1,-6,4,5,-6,1,4,1]
Output: [5,-1,4,4,-6,-6,1,1,1]
 

Constraints:

1 <= nums.length <= 100
-100 <= nums[i] <= 100
*/

class Solution {
    public int[] frequencySort(int[] nums) {
        
        HashMap<Integer,Integer> map =new HashMap<>();

        for(int i=0;i<nums.length;i++){

            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        List<Integer> arr = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
        }

        Collections.sort(arr,new Comparator<Integer>(){
            @Override
            public int compare(Integer n1 , Integer n2){
                int freq1= map.get(n1);
                int freq2= map.get(n2);

                if(freq1!=freq2){
                    return Integer.compare(freq1,freq2);
                }
                else{
                    return Integer.compare(n2,n1);
                }
            }

        });
        int k=0;
        for(Integer i:arr){
            nums[k]=i;
            k++;
        }

        return nums;
        
    }
}
