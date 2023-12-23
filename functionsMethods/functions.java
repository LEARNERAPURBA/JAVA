package functionsMethods;

//Make a function to add 2 numbers and return the sum
import java.util.*;

public class functions {
    /*
     * public static int addNum(int a, int b) {
     * int sum = a + b;
     * return sum;
     * }
     * 
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * int a = sc.nextInt();
     * int b = sc.nextInt();
     * int sum=addNum(a, b);
     * System.out.println(sum);
     * }
     * }
     
    // Make a function to multiply 2 numbers and return product
    public static int productNum(int a, int b) {
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(productNum(a, b));*/

    //Find factorial of a number
    public static void printFactorial(int n){
        int factorial=1;
            for(int i=1;i<=n;i++){
                factorial=factorial*i;
            }
            System.out.println(factorial);
    }   
    public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            
            printFactorial(n);
        }
    }


