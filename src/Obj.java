//class :: Blueprint
 //Object :: real instance of class
class House{
    String color = "white";
    void room(){
        System.out.println("There are 5 rooms in the house!");
    }
}

public class Obj {
    public static void main(String[] args){
        House h = new House();

        System.out.println(h.color);
        h.room();
    }
}
