# GROUPASSGN - Rating 872

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Group Assignment

Chef's professor is planning to give his class a group assignment. There are $2N$ students in the class, with distinct roll numbers ranging from $1$ to $2N$. Chef's roll number is $X$.

The professor decided to create $N$ groups of $2$ students each. The groups were created as follows: the first group consists of roll numbers $1$ and $2N$, the second group of roll numbers $2$ and $2N - 1$, and so on, with the final group consisting of roll numbers $N$ and $N+1$.

Chef wonders who his partner will be. Can you help Chef by telling him the roll number of his partner?

### Input Format
- The first line of input will contain an integer $T$ — the number of test cases. The description of $T$ test cases follows.
- The first and only line of each test case contains two integers $N$ and $X$, denoting the number of groups that will be formed, and Chef's roll number.
### Output Format

For each test case, output the roll number of the student that will be Chef's partner.

### Constraints
- $1 \leq T \leq 10^3$
- $1 \leq N \leq 10^8$
- $1 \leq X \leq 2N$
### Sample 1:
Input
Output

```
3
2 2
3 1
3 4

```

```
3
6
3
```

### Explanation:

 **Test case $1$** : The groups will be $\{(1, 4), (2, 3)\}$. Chef's roll number is $2$, so his partner's roll number will be $3$.

 **Test case $2$** : The groups will be $\{(1, 6), (2, 5), (3, 4)\}$. Chef's roll number is $1$, so his partner's roll number will be $6$.

 **Test case $3$** : The groups will be $\{(1, 6), (2, 5), (3, 4)\}$. Chef's roll number is $4$, so his partner's roll number will be $3$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T07:04:48.487Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            System.out.println((2*n+1)-x);
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/GROUPASSGN)