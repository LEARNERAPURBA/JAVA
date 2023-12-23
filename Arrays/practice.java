package Arrays;

/*reverse array */


import java.util.*;

public class practice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        int n = Math.floorDiv(size, 2);
        int temp;
        for (int i = 0; i < n; i++) {
            temp = numbers[i];
            numbers[i] = numbers[size - 1 - i];
            numbers[size - 1 - i] = temp;
        }
        for (int element : numbers) {
            System.out.print(element + " ");
        }
    }
}
