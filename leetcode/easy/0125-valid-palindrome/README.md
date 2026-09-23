# Valid Palindrome

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A phrase is a  **palindrome**  if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string `s`, return `true` *if it is a  **palindrome**, or* `false` *otherwise*.

 

 **Example 1:** 

```
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

```

 **Example 2:** 

```
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

```

 **Example 3:** 

```
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

```

 

 **Constraints:** 

- 1 <= s.length <= 2 * 105
- s consists only of printable ASCII characters.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 99.30%)  
**Memory:** 44.1 MB (beats 91.00%)  
**Submitted:** 2026-09-23T07:14:04.560Z  

```java
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            char leftchar = s.charAt(left);
            char rightchar = s.charAt(right);
            if(!Character.isLetterOrDigit(leftchar)){
                left++;
            } 
            else if(!Character.isLetterOrDigit(rightchar)){
                right--;
            } 
            else {
                if(Character.toLowerCase(leftchar)==Character.toLowerCase(rightchar)){
                    left++;
                    right--;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-palindrome/)