# Substrings of Size Three with Distinct Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A string is  **good**  if there are no repeated characters.

Given a string `s`​​​​​, return  *the number of  **good substrings**  of length  **three** in* `s`​​​​​​.

Note that if there are multiple occurrences of the same substring, every occurrence should be counted.

A  **substring**  is a contiguous sequence of characters in a string.

 

 **Example 1:** 

```
Input: s = "xyzzaz"
Output: 1
Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz". 
The only good substring of length 3 is "xyz".

```

 **Example 2:** 

```
Input: s = "aababcabc"
Output: 4
Explanation: There are 7 substrings of size 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc".
The good substrings are "abc", "bca", "cab", and "abc".

```

 

 **Constraints:** 

- 1 <= s.length <= 100
- s​​​​​​ consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 95.84%)  
**Memory:** 42.7 MB (beats 77.37%)  
**Submitted:** 2026-10-07T06:16:36.272Z  

```java
class Solution {
    public int countGoodSubstrings(String s) {
        // x y z z a z

        int windowLeft = 0;
        int goodSubstringsCount = 0;

        for(int windowRight = 0; 
        windowRight < s.length(); windowRight++)
        {
            // get the window length
            int windowLength = windowRight - windowLeft + 1;

            if(windowLength == 3)
            {
                // 3 elements are in the window
                // access those 3 characters
                char firstChar = s.charAt(windowLeft);
                char middleChar = s.charAt(windowLeft + 1);
                char lastChar = s.charAt(windowRight);

                if(firstChar != middleChar &&
                firstChar != lastChar && 
                middleChar != lastChar )
                {
                    goodSubstringsCount++;
                }
                windowLeft++;
            }
        }

        return goodSubstringsCount;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/)