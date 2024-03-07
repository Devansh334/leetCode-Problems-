/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
*/

bool isAnagram(char* s, char* t) {

    if(strlen(s)!=strlen(t)){
        return false;
    }

    int count1[26]={0};
    int count2[26]={0};

    for(int i=0;i<strlen(s);i++){
        count1[s[i]-97]++;
    }

     for(int i=0;i<strlen(t);i++){
        count2[t[i]-97]++;
    }
    for(int i=0;i<26;i++){
       if(count1[i]!=count2[i]){
           return false;
       }
    }
    return true;
}
