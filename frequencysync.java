import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

public class frequencysync {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,2,1};
        String str="aabbcc";
        HashMap<Character,Integer> charFreq=new HashMap<>();
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(!charFreq.containsKey(ch[i])){
                charFreq.put(ch[i],1);
            }
            else{
                charFreq.put(ch[i],charFreq.get(ch[i])+1);
            }
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        HashSet<Integer> charSet=new HashSet<>(charFreq.values());
        HashSet<Integer> IntSet=new HashSet<>(charFreq.values());
        charSet.retainAll(IntSet);
        System.out.println(charSet.size());
    }
}
