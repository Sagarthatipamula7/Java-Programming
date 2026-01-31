class Student{
    private int age;
    private String name;
    public String getName(){
        return name;
    }
    public void  setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int  getAge(){
        return age;
    }
}
public class oops2encapsulation {
    public static void main(String args[]){
        Student s=new Student();
        // s.name="sagar";  we cannot directly access methods and variables 
        s.setAge(20);
        s.setName("sagar");
        System.out.println(s.getName()+" : "+s.getAge());
    }
}
