                                /* Abstraction */

abstract class Atmfn{
    abstract void pin();

    void insertCard(){
        System.out.println("enter a card : ");
    }
    abstract void dashboard();
}
class finAtm extends Atmfn{
  void pin(){
        System.out.println("Enter your pin : ");
    }
    void dashboard(){
      System.out.println("Dashboard :");
    }
}

public class AbATM {
    public static void main(String[] args){
        finAtm atm = new finAtm();


        atm.insertCard();
        atm.dashboard();
        atm.pin();
    }
}
