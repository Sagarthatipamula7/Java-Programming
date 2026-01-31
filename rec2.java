public class rec2 {

    public static int sum(int N){
        if(N==0){
            return 0;
        }
        return N+sum(N-1);
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
