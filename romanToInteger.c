/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

 

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 

Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].
*/


int value(char x){
    if(x=='I') return 1;
    else if (x=='V') return 5;
    else if (x=='X') return 10;
    else if (x=='L') return 50;
    else if (x=='C') return 100;
    else if (x=='D') return 500;
    else if (x=='M') return 1000;
    else return 0;
}
int romanToInt(char s[]) {
    int sum=0;
    int i=0;
    for( i=0;i<strlen(s)-1;i++){
        if(s[i]=='I' ){
            if(s[i+1]=='V'){
                sum=sum+4;
                i++;
            }
            else if(s[i+1]=='X'){
                sum=sum+9;
                i++;
            }
            else{

        sum=sum+value(s[i]);
        }
        }
        else if(s[i]=='X' ){
            if(s[i+1]=='L'){
                sum=sum+40;
                i++;
            }
            else if(s[i+1]=='C'){
                sum=sum+90;
                i++;
            }
            else{

        sum=sum+value(s[i]);
        }
        }
         else if(s[i]=='C' ){
            if(s[i+1]=='D'){
                sum=sum+400;
                i++;
            }
            else if(s[i+1]=='M'){
                sum=sum+900;
                i++;
            }
            else{

        sum=sum+value(s[i]);
        }
        }
        else{

        sum=sum+value(s[i]);
        }
    }
    
    sum=sum+value(s[i]);
    return sum;
}
