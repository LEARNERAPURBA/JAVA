//Write a function that takes in the radius as input 
//and returns the circumference of a circle.
package functionsMethods.exercize;

import java.util.*;

public class eq4 {
    public static double circum(double r) {

        double circum = 2 * 3.14 * r;
        return circum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input r: ");
        double r = sc.nextDouble();

        System.out.println("circumference of circle is:" + circum(r));
    }
}
