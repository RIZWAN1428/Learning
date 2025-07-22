public class Method {
    public static void greet(){
        System.out.println("hello");
    }
    public static void sum(int a, int b){
        System.out.println("Sum : " + (a+b));
    }
    public static int square(int x){
        return x*x;
    }

    public static void main (String[] args){
        greet();
        sum(10,5);
        System.out.println("Square: "+ square(6));
    }
}
