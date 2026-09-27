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
            boolean holiday[] = new boolean[31];
            int count = 0;
            for (int i = 6; i <= 30; i += 7) {
                holiday[i] = true;
                count++;
            }
            for (int i = 7; i <= 30; i += 7) {
                holiday[i] = true;
                count++;
            }
            for (int i = 0; i < N; i++) {
                int day = sc.nextInt();
                if (!holiday[day]) {
                    holiday[day] = true;
                    count++;
                }
            }
            System.out.println(count);
        }
	}
}
