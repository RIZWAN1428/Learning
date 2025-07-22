class Father{
    void father(){
        System.out.println("I am father !");
    }
}
            /*Single Inheritance*/
class Son extends Father{
    void son(){
        System.out.println("I am father's son! ");
    }
}
            /*Multilevel Inheritance*/
class GrandSon extends Son{
    void grandSon(){
        System.out.println("I am grandson !");
    }
}
                    /*Hierarchical Inheritance*/
class Daughter extends Father{
    void daughter(){
        System.out.println("I am daughter !");
    }
}

public class InFamily {
    public static void main (String[] args){
        GrandSon gs = new GrandSon();
        gs.grandSon();
        gs.son();
        gs.father();

        Daughter dr = new Daughter();
        dr.daughter();
        dr.father();
    }
}
