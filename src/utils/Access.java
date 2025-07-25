//  | Modifier    | Same Class | Same Package | Subclass | Other Package |
 // | ----------- | ----------  | ------------  | --------   | ------------- |
  //| `private`   | ✅          | ❌            | ❌        | ❌             |
 // | `default`   | ✅          | ✅            | ❌        | ❌             |
  //| `protected` | ✅          | ✅            | ✅        | ❌             |
 // | `public`    | ✅          | ✅            | ✅        | ✅             |


package utils;

public class Access {
    private int a = 10;
    public int b = 20;
    protected int c = 30;
    int d = 40; // default

    public void printAll() {
        System.out.println("a=" + a + ", b=" + b + ", c=" + c + ", d=" + d);
    }
}
