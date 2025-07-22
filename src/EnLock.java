                            /*Encapsulation*/

class PhLock{
    private int pin = 65213;

    public int getPin(){
        return pin;
    }

    public  int setPin(){
        pin = 433354;
        return pin;
    }

    void askPin(){
        System.out.println("*enter pin*");
    }
}


public class EnLock {
    public static void main(String[] args){
        PhLock pl = new PhLock();

        pl.askPin();
        System.out.println("the pin is : " + pl.getPin());
        System.out.println("After change the new pin is : " + pl.setPin());
    }
}
