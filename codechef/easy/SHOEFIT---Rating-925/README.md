# SHOEFIT - Rating 925

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Shoe Fit

You have three shoes of the same size lying around. Each shoe is either a left shoe (represented using $0$) or a right shoe (represented using $1$). Given $A$, $B$, $C$, representing the information for each shoe, find out whether you can go out now, wearing one left shoe and one right shoe.

### Input Format
- The first line contains an integer $T$, the number of test cases. Then the test cases follow.
- Each test case contains a single line of input, three integers $A$, $B$, $C$.
### Output Format

For each test case, output in a single line the answer: $1$ if it's possible to go out with a pair of shoes and $0$ if not.

### Constraints
- $1 \leq T \leq 8$
- $0 \leq A, B, C \leq 1$
### Sample 1:
Input
Output

```
3
0 0 0
0 1 1
1 0 1
```

```
0
1
1
```

### Explanation:

 **Test Case $1$:**  Since there's no right shoe, it's not possible to go out with a pair of shoes.

 **Test Case $2$:**  It's possible to go out with a pair of shoes wearing the first and last shoes.

 **Test Case $3$:**  It's possible to go out with a pair of shoes wearing the first and second shoes.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T15:36:48.917Z  

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
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	    if ((a == 0 && (b == 1 || c == 1)) || (a == 1 && (b == 0 || c == 0)))
            System.out.println(1);
        else
            System.out.println(0);
		}
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SHOEFIT)