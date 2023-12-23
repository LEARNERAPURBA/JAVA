package functionsMethods;
/*Method overloading is methods with SAME name but DIFFERENT parameters */
public class methodOverloading {
    static void gm(){ //gm has same name 
        System.out.println("good morning");
    }
    static void gm(int a){ //but different parameters
        
        System.out.println(a);

    }
    public static void main(String[]args){

    gm(); //Arguments are actual
    gm(22);
    }
}
