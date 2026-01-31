import java.util.*;
public class noofdivisors {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        // for(int i=1;i<=n;i++){
        //     if(n%i==0){
        //         count++;
        //     }
        // } Brute force
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(i*i==n){
                    count++;
                }
                else{
                    count+=2;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
