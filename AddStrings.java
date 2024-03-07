/*
Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.

 

Example 1:

Input: num1 = "11", num2 = "123"
Output: "134"
Example 2:

Input: num1 = "456", num2 = "77"
Output: "533"
Example 3:

Input: num1 = "0", num2 = "0"
Output: "0"
 

Constraints:

1 <= num1.length, num2.length <= 104
num1 and num2 consist of only digits.
num1 and num2 don't have any leading zeros except for the zero itself.
*/

class Solution {
    public String addStrings(String num1, String num2) {
        int len1=num1.length();
        int len2=num2.length();
        int i=len1-1;
        int j=len2-1;
        String ans="";
        int carry=0;
        while(i>=0 && j>=0){
            int n1=Integer.parseInt(String.valueOf(num1.charAt(i)));
            int n2=Integer.parseInt(String.valueOf(num2.charAt(j)));
            int n3=n1+n2+carry;
            ans=Integer.toString(n3%10)+ans;
            carry=n3/10;
            i--;
            j--;
        }
        while(i>=0){
            int n1=Integer.parseInt(String.valueOf(num1.charAt(i)));
            int x=n1+carry;
            carry=x/10;
            if(carry>0){
                ans=Integer.toString(x%10)+ans;
            }else{
                ans=Integer.toString(x)+ans;
            }
            i--;
        }
        while(j>=0){
            int n2=Integer.parseInt(String.valueOf(num2.charAt(j)));
            int x=n2+carry;
            carry=x/10;
            if(carry>0){
                ans=Integer.toString(x%10)+ans;
            }else{
                ans=Integer.toString(x)+ans;
            }
            j--;
        }
        if(carry>0){
            return Integer.toString(carry)+ans;
        }
        return ans;
    }
}
