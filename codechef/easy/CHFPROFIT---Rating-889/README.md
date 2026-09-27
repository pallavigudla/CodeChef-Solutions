# CHFPROFIT - Rating 889

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Chef and Profits

Some time ago, Chef bought $X$ stocks at the cost of Rs. $Y$ each. Today, Chef is going to sell  **all**  these $X$ stocks at Rs. $Z$ each. What is Chef's total profit after he sells them?

Chef's profit equals the total amount he received by selling the stocks, minus the total amount he spent buying them.

### Input Format
- The first line of input contains an integer $T$, denoting the number of test cases. The description of $T$ test cases follows.
- The first and only line of each test case contains three space-separated integers $X, Y$ and $Z$ — the number of stocks, the price they were bought at, and the price they can be sold at, respectively.
### Output Format

For each test case print on a new line a single integer — Chef's profit after selling all the stocks he has.

### Constraints
- $1 \leq T \leq 100$
- $1 \leq X, Y \leq 10^4$
- $Y \leq Z \leq 10^4$
### Sample 1:
Input
Output

```
3
2 5 20
3 1 2
4 5 6
```

```
30
3
4

```

### Explanation:

 **Test Case 1:**  Chef bought $X = 2$ stocks for $Y = 5$ each, making the total amount  **spent**  by Chef $= 2 \cdot 5 = 10$.

Chef can sell this stock today for $Z = 20$, making the total amount  **received**  by Chef $= 2 \cdot 20 = 40$.

The total  **profit**  is then the amount  **received**  minus the amount  **spent**, which equals $40 - 10 = 30$.

 **Test Case 2:**  Chef bought $X = 3$ stocks for $Y = 1$ each, making the total amount  **spent**  by Chef $= 3 \cdot 1 = 3$.

Chef can sell this stock today for $Z = 2$, making the total amount  **received**  by Chef $= 3 \cdot 2 = 6$.

The total  **profit**  is then the amount  **received**  minus the amount  **spent**, which equals $6 - 3 = 3$.

 **Test Case 3:**  Chef bought $X = 4$ stocks for $Y = 5$ each, making the total amount  **spent**  by Chef $= 4 \cdot 5 = 20$.

Chef can sell this stock today for $Z = 6$, making the total amount  **received**  by Chef $= 4 \cdot 6 = 24$.

The total  **profit**  is then the amount  **received**  minus the amount  **spent**, which equals $24 - 20 = 4$

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-27T04:30:14.804Z  

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
        while(t-- > 0){
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int s = x*z-x*y;
        System.out.println(s);
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CHFPROFIT)