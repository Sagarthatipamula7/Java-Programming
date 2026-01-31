class Calc{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b, int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }
}
class oops5{
    public static void main(String[] args) {
        Calc obj = new Calc();
        System.out.println(obj.add(4,5,1));
    }
}