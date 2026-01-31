
class Student{
    int age;
    String name;
    static int marks;
    Student(){
        this(18);
        System.out.println("In constructor");
    }
    Student(int age){
        System.out.println(age);
    }
    void display(){
        System.out.println(name+" : "+age+" : "+marks);
    }
    static{
        System.out.println("Inside the static block");
    }
    public static void show(){
        System.out.println(marks);
    }
}
public class oops3static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age=19;
        s1.name="sagar";
        Student.marks=100; // possible but not practical because static variables belongs to class not to any specified objects

        s1.display();

        Student s2=new Student();
        s2.age=20;
        s2.name="shiva";
        Student.marks=200;

        s2.display();
        s1.display();

        Student.show();
    }
}