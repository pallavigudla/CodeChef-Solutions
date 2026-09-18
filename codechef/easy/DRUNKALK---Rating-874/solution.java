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
            int k = sc.nextInt();
            if(k%2==0){
                System.out.println(k);
            }
            else
            System.out.println(k+2);
        }
	}
}
