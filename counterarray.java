import java.util.*;
public class counterarray {
    public static void main(String[] args) {
        int arr[]={1,0,1,0,1,0,1,1,1,1,0,0,0,0,0};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
        }
        int cnt[]=new int[max+1];
        for(int i=0;i<n;i++){
            cnt[arr[i]]++;
        }
        for(int i=0;i<cnt.length;i++){
            for(int j=0;j<cnt[i];j++){
                System.out.print(i+" ");
            }
        }
    }
}
