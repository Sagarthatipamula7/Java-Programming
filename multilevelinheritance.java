class Mobile{
    String name;
    String model;
    void display(){
        System.out.println("I am in a Base class");
    }
}
class Samsung extends Mobile{
    String display_type;
    void display(){
        System.out.println(name);
        System.out.println(model);
    }
}
class Mi extends Samsung{
    void screen(){
        System.out.println(name);
        System.out.println(model);
        System.out.println(display_type);
    }
}
public class multilevelinheritance {
    public static void main(String[] args) {
        Mi m=new Mi();
        Samsung s=new Samsung();
        s.name="samsung";
        s.model="2022";
        s.display_type="curved";
        m.model="2023";
        m.name="Mi";
        m.display_type="curved";
        m.display();
        m.screen();
    }
}
