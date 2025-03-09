/*
Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

 

Example 1:

Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
Example 2:

Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".
Example 3:

Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".
 

Constraints:

1 <= s.length, t.length <= 200
s and t only contain lowercase letters and '#' characters.
 
*/

class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '#' && !sStack.isEmpty()) {
                sStack.pop();
            } else if (ch != '#') {
                sStack.push(ch);
            }
        }

        for (char ch : t.toCharArray()) {
            if (ch == '#' && !tStack.isEmpty()) {
                tStack.pop();
            } else if (ch != '#') {
                tStack.push(ch);
            }
        }
       return sStack.toString().equals(tStack.toString());


    }
}
