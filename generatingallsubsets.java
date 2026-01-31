import java.util.*;
public class generatingallsubsets {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int n=arr.length;
        List<List<Integer>>res=new ArrayList<>();
        for(int i=0;i<1<<n;i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i & (1<<j))!=0){
                    list.add(arr[j]);
                }
            }
            res.add(list);
        }
        System.out.println(res);
    }
}
