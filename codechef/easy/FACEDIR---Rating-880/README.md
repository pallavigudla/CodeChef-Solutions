# FACEDIR - Rating 880

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Find the Direction

Chef is currently facing the north direction. Each second he rotates exactly $90$ degrees in clockwise direction. Find the direction in which Chef is facing after exactly $X$ seconds.

$\textbf{Note}:$ There are only 4 directions: North, East, South, West (in clockwise order).

### Input Format
- First line will contain $T$, number of testcases. Then the testcases follow.
- Each testcase contains of a single integer $X$.
### Output Format

For each testcase, output the direction in which Chef is facing after exactly $X$ seconds.

### Constraints
- $1 \leq T \leq 100$
- $1 \leq X \leq 1000$
### Sample 1:
Input
Output

```
3
1
3
6

```

```
East
West
South

```

### Explanation:

Chef is facing North in the starting.

 **Test Case $1$:**  After $1$ second he turns $90$ degrees clockwise and now faces the east direction.

 **Test Case $2$:**  Direction after $1$ second- east

Direction after $2$ seconds- south

Direction after $3$ seconds- west

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T15:32:45.812Z  

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
        while(t-- >0){
            int n = sc.nextInt();
            int d = n%4;
            if (d == 0)
            System.out.println("North");
            else if (d == 1)
            System.out.println("East");
            else if (d == 2)
            System.out.println("South");
            else
            System.out.println("West");
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FACEDIR)