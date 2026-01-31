import java.util.*;
public class pack2andpack4 {
    public static void main(String[] args) {
        int x=10;
        int y=10;
        int z=21;
        int min=Integer.MAX_VALUE;
        for(int pack4=0;pack4<=z/4;pack4++){
            int currentPack4=pack4*4;
            int currentPack2=z-currentPack4;
            int pack2=(currentPack2+1)/2;
            int total_cost=(pack4*y)+(pack2*x);
            min=Math.min(min,total_cost);
        }
        System.out.println(min);
    }
}
