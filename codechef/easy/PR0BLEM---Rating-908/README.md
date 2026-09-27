# PR0BLEM - Rating 908

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Problem

*One less problem without ya
I got one less problem without ya*

Alice and Bob are competing in a challenge. Initially Alice has $N$ problems and Bob has $M$ problems.

- Each time Alice solves a problem, Bob receives one more problem to solve.
- Each time Bob solves a problem, Alice receives three more problems to solve.

Find whether it is possible that both of them have the  **same**  number of problems left if they can solve the problems in any arbitrary manner.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case contains two space-separated integers $N$ and $M$ — the initial number of problems of Alice and Bob respectively.
### Output Format

For each test case, output on a new line, `YES`, it is possible that both of them have the  **same**  number of problems left if they can solve the problems in any arbitrary manner and `NO` otherwise.

Each character of the output may be printed in either uppercase or lowercase. That is, the strings `NO`, `no`, `nO`, and `No` will be treated as equivalent.

### Constraints
- $1 \leq T \leq 100$
- $1 \leq N, M \leq 100$
### Sample 1:
Input
Output

```
4
4 2
1 5
2 3
2 2

```

```
YES
YES
NO
YES

```

### Explanation:

 **Test case $1$:**  Initially Alice has $4$ problems while Bob has $2$ problems.
Alice can solve a problem first. Thus, Alice now has $4-1 = 3$ problems left and Bob has $2 + 1 = 3$ problems left.

Thus, both of them can have same number of problems left.

 **Test case $2$:**  Initially Alice has $1$ problem while Bob has $5$ problems.
Bob can solve a problem first. Thus, Bob now has $5-1 = 4$ problems left and Alice has $1 + 3 = 4$ problems left.

Thus, both of them can have same number of problems left.

 **Test case $3$:**  It can be proven that they cannot have the same number of problems left.

 **Test case $4$:**  Both of them have the same number of problems initially.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-27T11:16:38.911Z  

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
            int N = sc.nextInt();
            int M = sc.nextInt();
            if ((N % 2) == (M % 2))
            System.out.println("YES");
            else
            System.out.println("NO");
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PR0BLEM)