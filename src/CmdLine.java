//Java command-line argument is an argument, i.e., passed at the time of running the Java program.
public class CmdLine {
    public static void main(String[] args){
        if (args.length > 0) {
            System.out.print("The coommand line arguments are: ");

            for(String val : args){
                System.out.print(val);
            }
        }
        else{
            System.out.println("No command line argument found");
        }
    }
}
