import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int diff = Math.abs(a - b);
            if (diff == 2 && (a % 2 == b % 2))
            System.out.println("YES");
            else if (diff == 1 && Math.min(a, b) % 2 == 1) 
            System.out.println("YES");
            else 
            System.out.println("NO");
		}
	}
}
