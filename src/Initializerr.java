//The initializer block contains the code that is always executed whenever an instance is created.
// and it runs each time when an object of the class is created.
// initializer block is always executed before the constructor.
public class Initializerr {
    // class member variable
    int speed;

    //Constructor
    Initializerr(){
        System.out.println("Speed of car: " +speed);
    }
    //Block
    {
        speed = 90;
    }
    public static void main(String[] args){
        Initializerr obj = new Initializerr();
    }
}
