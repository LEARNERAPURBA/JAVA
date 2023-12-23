package functionsMethods.exercize;

import java.util.*;

public class eq9 {

    public static void gcdOf2n(int a, int b, int g) {
        g = 0;
        for (int i = 1; i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                g = i;
            }
        }
        System.out.println("GCD of this two number is " + g);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        gcdOf2n(a, b, b);
    }
}