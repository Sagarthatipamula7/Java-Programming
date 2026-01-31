import java.util.*;
public class Duplicatesinarr {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,8,6,8,4};
        int n=arr.length;
        List<Integer>res=new ArrayList<>();
        for(int i=0;i<n;i++){
            int ele=Math.abs(arr[i]);
            int seat=ele-1;
            if(arr[seat]<0){
                res.add(arr[i]);
            }
            else{
                arr[seat]=-arr[seat];
            }
        }
        for(int ele:res){
            System.out.print(ele+" ");
        }
    }
}
