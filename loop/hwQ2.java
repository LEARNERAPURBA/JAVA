/* Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
	Because marks don’t matter but our effort does.
(Hint : use do-while loop but think & understand why)
 */
package loop;
import java.util.*;
public class hwQ2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            int Marks=sc.nextInt();
            if(Marks>=90 && Marks<=100){
                System.out.println("This is Good");
            }else if(Marks<=89 && Marks>=60){
                System.out.println("This is also Good");
            }else if(Marks>=0 && Marks<=59){
                System.out.println("This is Good as well");
            }else{
                System.out.println("Invalid");
            }System.out.println("Press 1 for continue or 2 for exit");
            n=sc.nextInt();
        }

        while(n==1);
    }
}
