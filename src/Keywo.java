class Animal {
    final String type= "Animal"; // final variable
    void sound(){
        System.out.println("Animal sound");
    }
}

class Dog extends  Animal{
    static int count =0;  // static variable
    Dog(){
        count++;
    }

    void sound(){
        super.sound(); // super variable
        System.out.println("dog's sound");
    }
}

public class Keywo {
    public static void main(String[] argss){
        Dog d1 = new Dog();
        Dog d2 = new Dog();

        d1.sound();  // uses super + overriding

        System.out.println("Count: " + Dog.count);  // static variable

        System.out.println(d1 instanceof Dog);     //instanceof
        System.out.println(d1 instanceof Animal);

        System.out.println("Type: " + d1.type);
    }
}
