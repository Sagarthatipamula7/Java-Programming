import java.util.*;
public class variation2 {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,5,6,7,1};
        int n=arr.length;
        int ans=-1;
        for(int i=0;i<n;i++){
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            Set<Integer>set=new HashSet<>();
            for(int j=i;j<n;j++){
                set.add(arr[j]);
                max=Math.max(max,arr[j]);
                min=Math.min(arr[j],min);
                if((max-min+1)==(set.size())){
                    ans=Math.max(ans,max-min+1);
                }
            }
        }
        System.out.println(ans);
    }
}
