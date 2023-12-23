package loop;

import java.util.*;

public class hwQ21 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        do {
            int Marks = sc.nextInt();
            if (Marks >= 90 && Marks <= 100) {
                System.out.println("This is Good");
            } else if (Marks >= 60 && Marks <= 89) {
                System.out.println("This is also Good");
            } else if (Marks <= 59 && Marks >= 0) {
                System.out.println("This is Good as well");
            } else {
                System.out.println("Invalid");
            }
             
            System.out.println("Want to continue?(Yes(1) or no (0))");
            n = sc.nextInt();
        } while (n == 1);

    }
}