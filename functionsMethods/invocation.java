package functionsMethods;

public class invocation {
    static void change(int a) {
        a = 98;
    }

    static void change2(int[] arr) {
        arr[0] = 98;
    }
    
    public static void main(String args[]){
        int marks[]={52,73,77,82,90};
        change2(marks);
        System.out.println(marks[0]);
    }
}