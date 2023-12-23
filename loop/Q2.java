//Print the table of a number input by the user.
package loop;
import java.util.*;
public class Q2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n*i); 
        }
        
    }
}