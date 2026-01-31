import java.util.*;
public class variations1 {
    public static boolean check(List<Integer> list){
        int n=list.size();
        for(int i=0;i<n-1;i++){
            if(list.get(i+1)-list.get(i)!=0 && list.get(i+1)-list.get(i)!=1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={1,2,9,3,5};
        int n=arr.length;
        int max=0;
        for(int i=0;i<n;i++){
            ArrayList<Integer>list=new ArrayList<>();
            for(int j=i;j<n;j++){
                list.add(arr[j]);
            
                Collections.sort(list);
                if(check(list)){
                    max=Math.max(max,list.size());
                }
            }
        }
        System.out.println(max);
    }
}
