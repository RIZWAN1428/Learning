//this refers to the current object.
//Used to avoid confusion when local and instance variable names are same
class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("name: " +name+ "  Age: " +age);
    }
}
public class This {
    public static void main(String[] args){
        Student st = new Student("Virat", 34);
        st.display();
    }
}
