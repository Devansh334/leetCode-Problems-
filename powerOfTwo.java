/*
 Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.

 

Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:

Input: n = 3
Output: false
 

Constraints:

-231 <= n <= 231 - 1
 */

class Solution {
    public boolean isPowerOfTwo(int n) {

        double m = n;
        double count = 0;
        double i = 0;
        if (n == 0) {
            return false;
        }
        while (count <= m) {
            if (count == m) {
                return true;
            }
            count = Math.pow(2, i);
            i++;
        }
        return false;
    }
}
