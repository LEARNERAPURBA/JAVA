/*Create an array of 5 floats and 
calculate their sum */
package Arrays;
import java.util.*;
public class arrayhq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        float numbers [] = new float [size];

        for(int i = 0; i<size;i++){
            numbers[i]= sc.nextFloat();
        }
        float sum = 0;
        for(float element:numbers){
            sum= sum+element;
        }
        System.out.println(sum);
    }
}
