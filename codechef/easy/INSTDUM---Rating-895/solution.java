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
            int sum = 0;
            int count = 0;
            for (int i = 1; i <= N; i++) {
                sum += sc.nextInt();
                if (sum == i) {
                    count++;
                }
            }
            System.out.println(count);
        }
	}
}
