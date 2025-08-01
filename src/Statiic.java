class Stat{
    //static variable
    static int i;
    //non-static variable
    int j;
    //static block
    static {
        int i =10;
        System.out.println("Static block called..!");
    }
    //Constructor
    Stat(){
        System.out.println("Constructor called...!");
    }
}
public class Statiic {
    public static void main(String[] args){
        //Although we have two objects, static block is executed only once.
        Stat s1 = new Stat();
        Stat s2 = new Stat();

        // Calling of static block
        // Nothing to do here as it is called
        // automatically as class is loaded in memory
    }
}
