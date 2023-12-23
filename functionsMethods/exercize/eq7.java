package functionsMethods.exercize;

//Write a program to enter the numbers till the user wants and at 
//the end it should display the count of positive, negative and zeros entered.
import java.util.*;

public class eq7 {
    public static void main(String[] args) {
        System.out.println("Enter numbers, type 'q' to stop");
        Scanner sc = new Scanner(System.in);
        int positivecount = 0;
        int negetivecount = 0;
        int zeros = 0;
        while (sc.hasNextInt()) {
            int num = sc.nextInt();

            if (num > 0) {
                positivecount++;
            } else if (num < 0) {
                negetivecount++;
            } else {
                zeros++;
            }
        }
        System.out.println("Count of positive Number " + positivecount);
        System.out.println("Count of negetive Number " + negetivecount);
        System.out.println("Count of zeros " + zeros);

    }
}
