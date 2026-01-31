import java.util.*;
public class pascaltriangle3 {
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
        int n=sc.nextInt();
        for(int r=1;r<=n;r++){
            for(int j=r;j<n;j++){
                System.out.print(" ");
            }
            for(int c=1;c<=r;c++){
                System.out.print(functionncr(r-1,c-1)+" ");
            }
            System.out.println();
        }
        sc.close();
    }   
}
