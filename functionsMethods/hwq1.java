//Make a function to check if a given number n is even or not.
package functionsMethods;

import java.util.*;

public class hwq1 {
    public static void printOddEven(int n) {
        if (n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printOddEven(n);
    }
}