//Make a function to print the table of a given number n.
package functionsMethods;
import java.util.*;
public class hwq2 {
public static void printTable(int n){
    for(int i=1;i<=10;i++){
        System.out.println(i*n);
    }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printTable(n);
    }    
}
