//Write a function that takes in age as input and returns if that person is 
//eligible to vote or not. A person of age > 18 is eligible to vote.
package functionsMethods.exercize;

import java.util.*;

public class eq5 {
    public static void eligibility(int age) {
        if (age >= 18) {
            System.out.println("eligible for vote");
        } else {
            System.out.println("You are not eligible");
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        eligibility(age);
    }
}
