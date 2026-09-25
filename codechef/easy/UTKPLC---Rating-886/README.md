# UTKPLC - Rating 886

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Utkarsh and Placement tests

Utkarsh is currently sitting for placements. He has applied to three companies named $A, B$, and $C$.

You know Utkarsh's order of preference among these $3$ companies, given to you as characters `first`, `second`, and `third` respectively (where `first` is the company he prefers most).

You also know that Utkarsh has received offers from exactly two of these three companies, given you as characters $x$ and $y$.

Utkarsh will always accept the offer from whichever company is highest on his preference list. Which company will he join?

### Input Format
- The first line of input contains a single integer $T$, denoting the number of test cases. The description of $T$ test cases follows.
- The first line of each test case contains three different space-separated characters: first, second, and third, denoting Utkarsh's order of preference among the three companies.
- The second line of each test case contains two space-separated characters $x$ and $y$, the companies from which Utkarsh has received offers.
### Output Format

For each test case, print one line containing a single character, the company whose offer Utkarsh will accept.

The output is not case sensitive, so if the answer is $A$, both $a$ and $A$ will be accepted.

### Constraints
- $1 \leq T \leq 36$
- first, second and third are three different characters among $\{A, B, C\}$.
- $x$ and $y$ are two different characters among $\{A, B, C\}$.
### Subtasks

 **Subtask #1 (100 points):**  Original constraints

### Sample 1:
Input
Output

```
2
A B C
A B
B C A
A C
```

```
A
C
```

### Explanation:

 **Test Case 1.**  Utkarsh has received offers from $A$ and $B$. Of these two, he prefers company $A$ (first preference) over $B$ (second preference). Therefore Utkarsh will accept the offer of company $A$.

 **Test Case 2.**  Utkarsh has received offers from $A$ and $C$, where company $C$ is his second preference and company $A$ is his third preference. Utkarsh will accept the offer of company $C$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T10:53:52.860Z  

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
		int t= sc.nextInt();
		while(t-->0){
		    char a = sc.next().charAt(0);
		    char b = sc.next().charAt(0);
		    char c = sc.next().charAt(0);
		    char d = sc.next().charAt(0);
		    char e = sc.next().charAt(0);
		    if (a == d || a == e)
                System.out.println(a);
            else
                System.out.println(b);
		    
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/UTKPLC)