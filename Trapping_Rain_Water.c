/*
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

 

Example 1:


Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9
 

Constraints:

n == height.length
1 <= n <= 2 * 104
0 <= height[i] <= 105
*/

int trap(int height[], int heightSize) {
    
    int left[heightSize];
    int right[heightSize];

    int max=height[0];
    for(int i=0;i<heightSize;i++){
        if(height[i]>=max){
            max=height[i];
        }
        left[i]=max;
    }

     max=height[heightSize-1];
    for(int i=heightSize-1;i>=0;i--){
        if(height[i]>=max){
            max=height[i];
        }
        right[i]=max;
    }
    int sum=0;
    for(int i=0;i<heightSize;i++){
        int temp;
        if(left[i]<=right[i]){
            temp=left[i];
        }
        else{
            temp=right[i];
        }

        sum=sum+temp-height[i];
    }
    return sum;

}
