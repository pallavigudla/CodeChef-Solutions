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
