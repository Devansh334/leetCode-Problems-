/*
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:

Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:

Input: s = "leetcode"

Output: "leotcede"

 

Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.
*/

class Solution {

    private boolean isVovel(char ch) {
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }
    }

    public String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char i : arr){
            if(isVovel(i)){
                stack.push(i);
            }
        }

        int j = 0;
        for(char i : arr){
            if(isVovel(i)){
                arr[j] = stack.pop();
            }
            j++;
        }

        return new String(arr);
    }
}
