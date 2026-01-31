import java.util.*;
public class pascaltriangle {
    public static int functionncr(int n,int r){
            int res=1;
            for(int i=0;i<r;i++){
                res=res*(n-i);
                res=res/(i+1);
            }
            return res;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(functionncr(r-1,c-1));
        sc.close();
    }
}
