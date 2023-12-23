package OOP.ClassCreation;
/*Create a class rectangle and it has two data members length and breadth
 * Now create two method getArea and getPerimeter which prints the area 
 * and Perimeter of the rectangle respectively.
 * 
 * Create a class called square which has only one data member called side.
 * Also in this class create two methods getArea and getPerimeter.
 * Which prints the area and perimeter respectively.
 */
 
class q1 {
    int length = 3;
    int breadth = 4;
    int getArea () {
        return length*breadth;
    }
    int getPerimeter (){
        return 2*(length+breadth);
    }
class square{
    int length = 7;
    int getArea (){
        return length*length;
    }
    int getPerimeter (){
        return 4*length;
    }
}
    public static void main(String[]args){
        q1 ref = new q1();
        square ref1 = ref.new square();
        System.out.println("Area of the Rectangle ="+ ref.getArea());
        System.out.println("Perimeter of the Rectangle ="+ ref.getPerimeter());
        System.out.println("Area of the Square "+ ref1.getArea());
        System.out.println("Perimeter of the Square "+ ref1.getPerimeter());
    }    
}
