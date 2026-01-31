import java.util.*;
public class diffprosum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pro=1,sum=0,r=0;
        while(n!=0){
            r=n%10;
            pro=pro*r;
            sum=sum+r;
            n=n/10;
        }
        System.out.println(pro-sum);
    }
}
