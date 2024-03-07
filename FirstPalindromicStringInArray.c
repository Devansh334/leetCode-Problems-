/*
Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

A string is palindromic if it reads the same forward and backward.

 

Example 1:

Input: words = ["abc","car","ada","racecar","cool"]
Output: "ada"
Explanation: The first string that is palindromic is "ada".
Note that "racecar" is also palindromic, but it is not the first.
Example 2:

Input: words = ["notapalindrome","racecar"]
Output: "racecar"
Explanation: The first and only string that is palindromic is "racecar".
Example 3:

Input: words = ["def","ghi"]
Output: ""
Explanation: There are no palindromic strings, so the empty string is returned.
 

Constraints:

1 <= words.length <= 100
1 <= words[i].length <= 100
words[i] consists only of lowercase English letters.
*/



char* firstPalindrome(char* words[], int wordsSize) {
    for(int i = 0; i < wordsSize; i++) {
        int n = strlen(words[i]);
        char ans[n + 1];
        strcpy(ans, words[i]);

        int k = n - 1;
        int flag = 1; // Reset flag for each word
        for(int j = 0; j < n / 2; j++) {
            if(ans[j] != ans[k--]) {
                flag = 0;
                break; // Break the loop early if not a palindrome
            }
        }
        if(flag == 1) {
            return strdup(ans); // Return a dynamically allocated copy
        }
    }
    char* ans = ""; // Empty string
    return ans;
}
