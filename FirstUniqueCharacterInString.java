/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

 

Example 1:

Input: s = "leetcode"

Output: 0

Explanation:

The character 'l' at index 0 is the first character that does not occur at any other index.

Example 2:

Input: s = "loveleetcode"

Output: 2

Example 3:

Input: s = "aabb"

Output: -1

 

Constraints:

1 <= s.length <= 105
s consists of only lowercase English letters.
*/

class Solution {
    public int firstUniqChar(String s) {
        
         HashMap<Character, int[]> map = new HashMap<>();
          for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, new int[]{i, 1}); 
            } else {
                map.get(c)[1]++; 
            }
        }
        int minIndex = Integer.MAX_VALUE;
        for (int[] value : map.values()) {
            if (value[1] == 1) {
                minIndex = Math.min(minIndex, value[0]);
            }
        }
        
        return minIndex == Integer.MAX_VALUE ? -1 : minIndex;
    }
}
