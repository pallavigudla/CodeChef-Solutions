# AVOIDCONTACT - Rating 907

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Avoid Contact

A hostel has $N$ rooms in a straight line. It has to accommodate $X$ people. Unfortunately, out of these $X$ people, $Y$ of them are infected with chickenpox. Due to safety norms, the following precaution must be taken:

- No person should occupy a room directly adjacent to a room occupied by a chickenpox-infected person. In particular, two chickenpox-infected people cannot occupy adjacent rooms.

For example, if room $4$ has a chickenpox-infected person, then nobody should occupy rooms $3$ and $5$. Similarly, if room $1$ has a chickenpox-infected person then nobody should occupy room $2$.

What's the  **minimum**  value of $N$ for which all the people can be accommodated in the hostel, following the above condition?

### Input Format
- The first line of input contains a single integer $T$ — the number of test cases. The description of $T$ test cases follows.
- The first and only line of each test case contains two integers $X$ and $Y$ — the total number of people and the number of chickenpox-infected people.
### Output Format

For each test case, output on a new line a single integer — the  **minimum**  value of $N$ for which all the people can be accommodated in the hostel.

### Constraints
- $1 \leq T \leq 200$
- $1 \leq X \leq 1000$
- $0 \leq Y \leq X$
### Sample 1:
Input
Output

```
3
4 0
5 3
3 3

```

```
4
8
5

```

### Explanation:

Note: Below, $C$ represents a room occupied by a chickenpox-infected person, $N$ represents a room occupied by an uninfected person, and $\_$ represents an empty room.

 **Test case $1$** : One of the possible ways to accommodate the people in $4$ rooms is:

$N$ $N$ $N$ $N$

 **Test case $2$** : One of the possible ways to accommodate the people in $8$ rooms is:

$C$ $\_$ $C$ $\_$ $N$ $N$ $\_$ $C$

 **Test case $3$** : One of the possible ways to accommodate the people in $5$ rooms is:

$C$ $\_$ $C$ $\_$ $C$

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-27T06:24:26.950Z  

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
        int T = sc.nextInt();
        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
             if (Y == 0)
            System.out.println(X);
            else if (X == Y)
            System.out.println(2 * Y - 1);
            else
            System.out.println(X + Y);
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/AVOIDCONTACT)