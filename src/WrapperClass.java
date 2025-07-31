// A Wrapper class in Java is one whose object wraps or contains primitive data types.

public class WrapperClass {
    public static void main(String[] args){
        // Primitive data type
        int b;

        //Integer Wrapper class
        Integer a;

        //Assigning value to primitive
        b = 10;

        // Auto-boxing or auto-wrapping converting primitive int to Integer object
        a=b;

        System.out.println("The primitive int b is: " + b);
        System.out.println("The Integer object a is: " + a);
    }
}
