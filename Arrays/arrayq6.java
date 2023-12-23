/*Take a matrix as input from user.
 * Search for a given number x and print the indices
 * at which it occurs
 */
package Arrays;
import java.util.*;
public class arrayq6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int numbers[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }            
        }
        int x = sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(numbers[i][j]==x){
                    System.out.println("X is found at " +i+","+j);
                }
            }
        }
    }
}
