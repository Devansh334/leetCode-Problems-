/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n= strs.length;
        Arrays.sort(strs);
        String strs1=strs[0];
        String strs2=strs[n-1];
        String ans="";
        int i=0;
        int n1=strs1.length();
        int n2=strs2.length();
        while((i<n1 && i<n2) && (strs1.charAt(i)==strs2.charAt(i))){
            ans=ans+strs1.charAt(i);
            i++;
        }

        return ans;
    }
}
