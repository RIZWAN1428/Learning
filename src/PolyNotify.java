
                               /*Method Overloading*/
class Notification{
    void sound(){
        System.out.println("Default sound.");
    }
    void sound(String newtone){
        System.out.println("New sound is:" +newtone);
    }
}
                              /*Method Overriding*/
class MobileNotification extends Notification{
    void sound(){
        System.out.println("This is mobile's sound");
    }
}
class DesktopNotification extends Notification{
    void sound(){
        System.out.println("This is desktop's sound");
    }
}

public class PolyNotify {
    public static void main (String[] args){
        DesktopNotification dn = new DesktopNotification();
        MobileNotification mn = new MobileNotification();

        Notification n = new Notification();
        n.sound();
        n.sound("beep-beep");

        dn.sound();
        mn.sound();
    }
}
