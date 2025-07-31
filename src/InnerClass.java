// The purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable.

class OutClass{
    int x = 10;

class InnClass{
    int y = 5;
    }
}
public class InnerClass {
    public static void main(String[] args){
        OutClass myOuter = new OutClass();
        OutClass.InnClass myInner = myOuter.new InnClass();
        System.out.println(myInner.y + myOuter.x);
    }
}
