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
