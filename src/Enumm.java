// A Java enumeration is a class type.
// Although we don't need to instantiate an enum using new, it has the same capabilities as other classes.
// unlike classes, enumerations neither inherit other classes nor can get extended(i.e become superclass).
//We can also add variables, methods, and constructors to it.
//The main objective of an enum is to define our own data types(Enumerated Data Types).
// Enum declaration can be done outside a class or inside a class but not inside a method.

enum Color {
    RED,
    GREEN,
    BLUE;
}

public class Enumm {
    public static void main(String[] args){
        Color c1 = Color.RED;
        System.out.println(c1);
    }
}
