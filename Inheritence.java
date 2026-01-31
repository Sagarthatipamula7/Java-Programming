class Student {
    String name;
}

class Topper extends Student {
    void display() {
        System.out.println(name);
    }
}

public class Inheritence {
    public static void main(String[] args) {
        Topper t = new Topper();
        t.name = "sagar";
        t.display();
    }
}
