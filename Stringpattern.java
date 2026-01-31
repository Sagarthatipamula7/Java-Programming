import java.util.*;

public class Stringpattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String pattern="abc";
            StringBuilder res=new StringBuilder();
            for(int i=0;i<n;i++){
                res.append(pattern.charAt(i%3));
            }
            System.out.print(res.toString());
        }
        sc.close();
    }
}
