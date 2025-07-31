public class ExceHandle {
    public static void main(String[] args){
        int m = 10;
        int n = 0;
        try {
            //Code that can throw an exception
            int res = n/m;
            System.out.println("Result :  " +res);
        }
        catch (ArithmeticException e){
            // Handle the exception
            System.out.println("Error: Division by zero is not allowed!");
        }
        finally {
            System.out.println("Program continues after handling the exception.");
        }
    }
}
