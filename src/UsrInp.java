import java.util.Scanner;
public class UsrInp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a name: ");
        String name = sc.nextLine();

        System.out.println("Enter Age : ");
        int age = sc.nextInt();

        System.out.println ("Hello: " +name+ ", Age: " +age);
    }
}
