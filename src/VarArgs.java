// Variable Arguments (Varargs) write methods that can take any number of inputs, which simply means we do not have to create more methods for different numbers of parameters.
// Only one Varargs parameter is allowed per method.
// Must be Specifying Varargs as the second parameter of the method instead of the first one
public class VarArgs {
    static void fun(String s, int... a){
        System.out.println("String : " +s);
        System.out.println("Number of arguments is: " + a.length);

        // using for each loop to display contents of a
        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        fun("Cricbuzz", 10, 20);
        fun("EspnCricInfo", 1,2,3,4,5);
        fun("CricTracker");
    }
}
