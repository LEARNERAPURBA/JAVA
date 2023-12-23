/*Write a program to impliment a Matrix with 2D array */
package Arrays;
import java.util.*;
public class arrayq5 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][]numbers = new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
