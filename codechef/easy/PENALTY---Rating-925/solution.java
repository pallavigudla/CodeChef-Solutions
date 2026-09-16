import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		int g = sc.nextInt();
		int h = sc.nextInt();
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		int k = a+c+e+g+i;
		int l = b+d+f+h+j;
		if(k>l)
		System.out.println("1");
		else if(k<l)
		System.out.println("2");
		else
		System.out.println("0");
		}
	}
}
