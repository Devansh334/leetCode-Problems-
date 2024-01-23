/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
 */

 bool isPalindrome(char s[]) {

    char str1[100000];
    char str2[100000];
    int j=0;
    for(int i=0;s[i]!='\0';i++){
        if(s[i]>='a'&& s[i]<='z'|| s[i]>='0'&&s[i]<='9'){
            
            str1[j++]=s[i];
        }
        else if(s[i]>='A'&& s[i]<='Z'){
            str1[j++]=s[i]+32;
        }
    }
    str1[j]='\0';
    j=0;
    for(int i=strlen(str1)-1;i>=0;i--){
        str2[j++]=str1[i];
    }
    str2[j]='\0';
    int r=strcmp(str1,str2);
    if(r==0){
        return true;
    }
    else{
        return false;
    }
    
}
