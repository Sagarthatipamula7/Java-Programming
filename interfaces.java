interface A{
    int age=01;
    void show();
    void display();
}
interface  x {
    void run();
    void show();
}
class B implements A,x{
    public void show(){
        System.out.println("In show");
    }
    public void display(){
        System.out.println("In Display");
    }
    public void run(){
        System.out.println("int x");
    }
}
public class interfaces {
    public static void main(String args[]){
        B obj;
        obj=new B();
        obj.show();
        obj.display();
        obj.run();
        // obj.age=10;
        System.out.println(A.age);
    }
}
