/*
You are given a positive integer num consisting only of digits 6 and 9.

Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).

 

Example 1:

Input: num = 9669
Output: 9969
Explanation: 
Changing the first digit results in 6669.
Changing the second digit results in 9969.
Changing the third digit results in 9699.
Changing the fourth digit results in 9666.
The maximum number is 9969.
Example 2:

Input: num = 9996
Output: 9999
Explanation: Changing the last digit 6 to 9 results in the maximum number.
Example 3:

Input: num = 9999
Output: 9999
Explanation: It is better not to apply any change.
 

Constraints:

1 <= num <= 104
num consists of only 6 and 9 digits.
*/

int countDigits(int num) {
    int count = 0;
    while (num > 0) {
        num = num / 10;
        count++;
    }
    return count;
}

int maximum69Number(int num) {
    int n = countDigits(num);
    int arr[n];
    int i = n - 1; 

    while (num > 0) {
        arr[i--] = num % 10;
        num = num / 10;
    }

    for (int j = 0; j < n; j++) {
        if (arr[j] == 6) { 
            arr[j] = 9;
            break;
        }
    }
    num = 0;
    for (int j = 0; j < n; j++) {
        num = num * 10 + arr[j];
    }
    return num;
}
