# CHEFRUN - Rating 886

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-27T04:23:15.455Z  

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
		    char x = sc.next().charAt(0);
		    char y = sc.next().charAt(0);
		    if (a == x || a == y)
                System.out.println(a);
            else
                System.out.println(b);
		    
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CHEFRUN)