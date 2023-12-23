//Two numbers are entered by the user, x and n. Write a function to find the 
//value of one number raised to the power of another i.e. xn.
package functionsMethods.exercize;

import java.util.*;

public class eq8 {
    public static int value(int x, int n) {
        int result=1;
            for (int i = 1; i <= n; i++) {
                result = result*x;
            }
            return result;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("After raising value the result is "+value(x, n));
    }
}
