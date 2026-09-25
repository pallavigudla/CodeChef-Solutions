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
