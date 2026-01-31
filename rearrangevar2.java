import java.util.ArrayList;
import java.util.HashSet;

public class rearrangevar2 {
    public static boolean check(ArrayList<Integer> list, int ele){
        return list.contains(ele);
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,6,5,4,7};
        int n=arr.length;
        int ans=-1;
        int start=-1;
        for(int i=0;i<n;i++){
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            // ArrayList<Integer> list =new ArrayList<>();
            // for(int j=i;j<n;j++){
            //     if(check(list,arr[j])){
            //         break;
            //     }
            //     list.add(arr[j]);
            //     max=Math.max(max,arr[j]);
            //     min=Math.min(min,arr[j]);
            //     if((max-min+1)==(j-i+1)){
            //         ans=Math.max(ans,j-i+1);
            //     }
            // }
            HashSet<Integer>set=new HashSet<>();
            for(int j=i;j<n;j++){
                if(set.contains(arr[j]))break;
                set.add(arr[j]);
                max=Math.max(max,arr[j]);
                min=Math.min(min, arr[j]);
                if((max-min+1)==set.size()){
                    if((max-min+1)>ans){
                        ans=max-min+1;
                        start=i;
                    }
                }
            }
        }
        for(int i=start;i<start+ans;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(ans);
    }
}
