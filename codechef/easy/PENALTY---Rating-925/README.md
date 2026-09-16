# PENALTY - Rating 925

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Penalty Shots

It's the soccer match finals in Chefland and as always it has reached the penalty shootouts. Each team is given $5$ shots to make and the team scoring a goal on the maximum number of shots wins the game. If both the teams' scores are equal, then the game is considered a draw and we would have $2$ champions.

Given ten integers $A_1, A_2, \ldots, A_{10}$, where the odd indexed integers($A_1, A_3,$ $A_5,$ $A_7, A_9$) represent the outcome of the shots made by team $1$ and even indexed integers($A_2, A_4, A_6, A_8, A_{10}$) represent the outcome of the shots made by team $2$ (here $A_i = 1$ indicates that it's a goal and $A_i = 0$ indicates a miss), determine the winner or find if the game ends in a draw.

### Input Format
- The first line of input contains a single integer $T$ denoting the number of test cases. The description of $T$ test cases follows.
- The first and only line of each test case contains ten space-separated integers $A_1, A_2, \ldots, A_{10}$.
### Output Format

For each test case, print a single line containing one integer - $0$ if the game ends in a draw or $1$ if the first team wins or $2$ if the second team wins.

### Constraints
- $1 \leq T \leq 1024$
- $0 \leq A_i \leq 1$
### Sample 1:
Input
Output

```
4
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1
1 0 1 0 0 0 0 0 0 0 
1 1 1 1 1 1 1 1 1 0
```

```
0
2
1
1
```

### Explanation:

 **Test case $1$:**  No team scores any goal, so the game ends in a draw.

 **Test case $2$:**  The second team is able to score in their final shot, while the first team has scored 0 goals and hence the second team wins.

 **Test case $3$:**  The first team is successfully able to make their first $2$ shots count and whereas the second team has not scored any goals. Therefore the first team wins.

 **Test case $4$:**  Team $2$ misses their final shot and hence team $1$ wins the game with the final score of $5 - 4$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T15:29:20.937Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		int g = sc.nextInt();
		int h = sc.nextInt();
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		int k = a+c+e+g+i;
		int l = b+d+f+h+j;
		if(k>l)
		System.out.println("1");
		else if(k<l)
		System.out.println("2");
		else
		System.out.println("0");
		}
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PENALTY)