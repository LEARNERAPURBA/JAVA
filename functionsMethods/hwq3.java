//Make a function to check if a number is prime or not
package functionsMethods;

import java.util.*;

public class hwq3 {
    public static void primeNumber(int n,int count ) {
        count = 0;
        if (n < 2) {
            System.out.println("not a prime number");
        } else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("it is a prime number");
            }else{
                System.out.println("Not prime");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeNumber(n, n);
    }
}
