/*
Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

 

Example 1:

Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.
Example 2:

Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.
Example 3:

Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.
 

Constraints:

1 <= s.length <= 105
s consists of lowercase English letters.
1 <= k <= s.length
*/

class Solution {

    public boolean isVovel(char c) {
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        
       char[] arr = s.toCharArray();
       int maxCount = 0;

        for(int i=0 ; i<k; i++) {
            if(isVovel(arr[i])){
                maxCount++;
            }
        }

        int count = maxCount ;

        for(int i= 1 ; i<s.length(); i++) {
            
            if(isVovel(arr[i-1])){
                count--;
            }
            if((i+k-1) < s.length() && isVovel(arr[i+k-1])){
                count++;
            }

            if(count>maxCount){
                maxCount = count;
            }
        }
        return maxCount;
    }
}
