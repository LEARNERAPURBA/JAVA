//Enter 3 numbers from the user & make a function to print their average.
package functionsMethods.exercize;

import java.util.*;

public class eq1 {
    public static void printAverage(int i, int j, int k) {
        int avg = (i + j + k) / 3;
        System.out.println("avg is " + avg);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        printAverage(i, j, k);

    }
}
