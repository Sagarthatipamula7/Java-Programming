import javax.sound.sampled.SourceDataLine;

public class rec1 {
    public static void fun(int N){
        if(N<1){
           return;
        }
        System.out.print(N+" ");
        fun(N-1);
    }
    public static void linear(int i,int N){
        if(i>N){
            return;
        }
        System.out.print(i+" ");
        linear(i+1, N);
    }
    public static void main(String[] args) {
        fun(5);
        System.out.println();
        linear(1,5);
    }
}