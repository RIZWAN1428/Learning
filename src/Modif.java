import utils.Access;

public class Modif {
    public static void main(String[] args) {
        Access obj = new Access();
        // System.out.println(obj.a); ❌ private
        System.out.println(obj.b);   // ✅ public
        // System.out.println(obj.c); ❌ protected (not same package or subclass)
        // System.out.println(obj.d); ❌ default (package-private)
    }
}
