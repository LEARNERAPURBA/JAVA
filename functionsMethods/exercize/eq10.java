package functionsMethods.exercize;

/*Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 ..... 
In the Fibonacci series, a number is the sum of the previous 2 numbers that came
 before it.
 */
import java.util.*;

public class eq10 {
    public static void fibonacci(int n, int t1, int t2, int c) {
        t1 = 0;
        t2 = 1;
        for (int i = 1; i <= n; i++) {
            c = t1 + t2;
            t1 = t2;
            t2 = c;

            System.out.println(t1);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n, n, n, n);
    }
}
