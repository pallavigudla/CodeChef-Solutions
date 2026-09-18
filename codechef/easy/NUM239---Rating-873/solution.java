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
		    int l = sc.nextInt();
		    int r = sc.nextInt();
		    int count = 0;
		    for(int i=l;i<=r;i++){
		    int d = i % 10;
		    if(d==2||d==3||d==9){
		        count++;
		       }
		    }
		    System.out.println(count);
		}
	}
}