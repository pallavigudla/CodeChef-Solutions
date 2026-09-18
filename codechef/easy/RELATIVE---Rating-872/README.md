# RELATIVE - Rating 872

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Relativity

In Chefland, the speed of light is $c\ \mathrm{m}/\mathrm{s}$, and acceleration due to gravity is $g\ \mathrm{m}/\mathrm{s}^2$.

Find the smallest height (in meters) from which Chef should jump such that during his journey down only under the effect of gravity and independent of any air resistance, he achieves the speed of light and verifies Einstein's theory of special relativity.

Assume he jumps at zero velocity and at any time, his velocity ($v$) and depth of descent ($H$) are related as $v^2 = 2 \cdot g \cdot H.$

### Input
- The first line contains an integer $T$, the number of test cases. Then the test cases follow.
- Each test case contains a single line of input, two integers $g$, $c$.
### Output

For each test case, output in a single line the answer to the problem. We can show that under the constraints, the answer is an integer.

### Constraints

$1 \leq T \leq 5\cdot 10^3$

- $1 \leq g \leq 10$
- $1000 \leq c \leq 3000$
- $2 \cdot g$ divides $c^2$.
### Subtasks

 **Subtask #1 (100 points):**  Original constraints

### Sample 1:
Input
Output

```
3
7 1400
5 1000
10 1000
```

```
140000
100000
50000
```

### Explanation:

 **Test Case $1$:**  For Chef to achieve the speed of light, the minimum height required is $\frac{c^2}{2 \cdot g}$ = $\frac{1400 \cdot 1400}{14}$ = $140000$ meters.

 **Test Case $3$:**  For Chef to achieve the speed of light, the minimum height required is $\frac{c^2}{2 \cdot g}$ = $\frac{1000 \cdot 1000}{20}$ = $50000$ meters.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T07:10:00.420Z  

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
		int t =sc.nextInt();
		while(t-- >0){
		    int g = sc.nextInt();
		    int c = sc.nextInt();
		    int f = (c*c)/(2*g);
		    System.out.println(f);
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/RELATIVE)