import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        Map<Integer,Integer>map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        for(int key:map.keySet()){
            System.out.println(key+":"+map.get(key));
        }
    }
}
