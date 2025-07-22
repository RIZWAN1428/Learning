                            /*Multiple inheritance*/

interface Faather{
    void faather();
}
interface Mother{
    void mother();
}

class Soon implements Faather, Mother{
    public void faather(){
        System.out.println("i am father ! ");
    }

    public void mother() {
        System.out.println("I am mother!");
    }
}

public class InFamIILy {
    public  static void main(String[] args){
        Soon s = new Soon();
        s.faather();
        s.mother();
    }
}
