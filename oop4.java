
class A{
    int x=5;
    A(){
        System.out.println("In A");
    }
    A(int n){
        System.out.println("In A int");
    }
    void display(){
        System.out.println("In Parent Class");
    }
}
class B extends A{
    int x=10;
    B(){
        System.out.println(x);
        System.out.println(super.x);
        System.out.println("In B");
    }
    B(int n){
        System.out.println("In B int");
    }
    void display(){
        super.display();
        System.out.println("In child class");
    }
}
public class oop4 {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
