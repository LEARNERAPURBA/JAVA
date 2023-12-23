package loop.patterns;

//1.Print a solid rhombus
import java.util.*;

public class homework {
    /*
     * public static void main(String args[]) {
     * Scanner sc = new Scanner(System.in);
     * int m = sc.nextInt();
     * int n = sc.nextInt();
     * 
     * for (int i = 1; i <= n; i++) {
     * for (int j = 1; j <= n - i; j++) {
     * System.out.print(" ");
     * }
     * for (int j = 1; j <= m; j++) {
     * System.out.print("*");
     * }
     * System.out.println();
     * }
     * }
     * 
     * // 2.Print a number pyramid
     * public static void main(String args[]) {
     * Scanner sc = new Scanner(System.in);
     * int n = sc.nextInt();
     * for (int i = 1; i <= n; i++) {
     * for (int j = 1; j <= n - i; j++) {
     * System.out.print(" ");
     * }
     * for (int j = 1; j <= i; j++) {
     * System.out.print(i+" ");
     * }
     * System.out.println();
     * }
     * }
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 1; j--) {
                System.out.print(j);
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
