//Print the sum of first n Natural numbers
package loop;

import java.util.*;

public class Q1 {
    public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int sum=0;
for (int i=1;i<=n;i++){
sum=sum+i;
}
System.out.println(sum);
    }
}
