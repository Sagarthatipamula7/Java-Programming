class Student{
    String name;
    int marks;
    Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
}
public class oops1 {
    public static void main(String[] args) {
        Student s1=new Student("sagar",99);
        Student s2=new Student("sai", 100);
        Student s3=new Student("Anil",100);
        Student st[]=new Student[3];
        st[0]=s1;
        st[1]=s2;
        st[2]=s3;
        for(Student s:st){
            System.out.println(s.name+" : "+s.marks);
        }
    }
}
