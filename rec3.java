public class rec3 {

    public static int fact(int N){
        if(N==1){
            return 1;
        }
        return N*fact(N-1);
    }
    public static void main(String[] args) {
        System.out.println(fact(4));
    }
}
