import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class fruitsintobasket {
    public static void main(String[] args) {
        int fruits[]={1, 2, 3, 2, 2};
        int n=fruits.length;
        int ans=0;
        int left=0;
        int right=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        while(right<n){
            if(!map.containsKey(fruits[right])){
                map.put(fruits[right],1);
            }
            else{
                map.put(fruits[right],map.get(fruits[right])+1);
            }
            if(map.size()>2){
                while(map.size()>2){
                    map.put(fruits[left],map.get(fruits[left])-1);
                    if(map.get(fruits[left])==0){
                        map.remove(fruits[left]);
                    }
                    left++;
                }
            }
            if(map.size()<=2){
                ans=Math.max(ans,right-left+1);
            }
            right++;
        }
        System.out.println(ans);
    }
}
