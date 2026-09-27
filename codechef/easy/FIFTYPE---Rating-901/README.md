# FIFTYPE - Rating 901

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Chef and Battery

Chef's phone has a battery level of $N$ percent.
Each minute:

- If the phone is on charging, the battery level increases by $2\%$.
- Otherwise, the battery level decreases by $3\%$.

Find the  **minimum**  time in which Chef can make the battery level reach  **exactly**  $50\%$.
Note that the battery level should always lie in the range $0$ to $100$ (both included).

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of single lines of input $N$ - the current battery level of Chef's phone.
### Output Format

For each test case, output on a new line the  **minimum**  time in which Chef can make the battery level reach  **exactly**  $50\%$.

### Constraints
- $1 \leq T \leq 1000$
- $0 \leq N \leq 100$
### Sample 1:
Input
Output

```
4
51
50
23
0

```

```
2
0
16
25

```

### Explanation:

 **Test case $1$:**  Chef can use his phone for $1$ minute. Thus, the battery drops to $48\%$.
Then, he can charge it for $1$ minute. Thus, the battery reaches exactly $50\%$.

 **Test case $2$:**  The battery level is already at $50\%$.

 **Test case $3$:**  Chef can charge the battery for $15$ minutes and use it for $1$ minute.
Thus, after $16$ minutes, the battery will be $50\%$.

 **Test case $4$:**  Chef can charge the battery for $25$ minutes to reach the battery level of $50\%$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-27T05:42:29.159Z  

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
            if (N == 50) {
                System.out.println(0);
            }
            else if (N < 50) {
                int diff = 50 - N;

                if (diff % 2 == 0)
                    System.out.println(diff / 2);
                else
                    System.out.println(((diff + 3) / 2)+1);
            }
            else {
                int diff = N - 50;

                if (diff % 3 == 0)
                    System.out.println(diff / 3);
                else if (diff % 3 == 1)
                    System.out.println(((diff + 2) / 3)+1);
                else
                    System.out.println(((diff + 4) / 3)+2);
            }
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FIFTYPE)