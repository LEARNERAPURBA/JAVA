/*Write a program to 
find out wheather a given int is
present in an array or not*/

package Arrays;

import java.util.*;

public class arrayhq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Size = sc.nextInt();
        int numbers[] = new int[Size];

        for (int i = 0; i < Size; i++) {
            numbers[i] = sc.nextInt();
        }
        int x = sc.nextInt(); 
        for(int i=0;i<numbers.length;i++){
            if(x==numbers[i]){
                System.out.println("x is found at index no:"+i);
            }
        }
    
    }    
}
