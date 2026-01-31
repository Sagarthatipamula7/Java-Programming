public class Hcf {
    public static void main(String[] args) {
        int x=605904 ,y=996510762;
        int gcd=0;
        int end=Math.min(x,y);
        for(int i=1;i<=end;i++){
            if(x%i==0 && y%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);
    }
}
