//Constructor = special method to initialize objects.
//Runs automatically when object is created.
//Name = same as class name.

class Car{
    String color;

    Car(String c){
        color = c;
    }

    void show(){
        System.out.println("Color: " + color);
    }
}

public class Constructor {
    public static void main(String[] args){
        Car c1 = new Car("Red");
        c1.show();
    }
}
