import java.util.*;

public class strings{
    public static void  main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        if(str1.length()!=str2.length()){
            System.out.println("Not an annagram");
            return;
        }
        String st1=str1.toLowerCase();
        String st2=str2.toLowerCase();
        int freq[]=new int[26];
        for(int i=0;i<st1.length();i++){
            int index1=st1.charAt(i)-'a';
            freq[index1]++;
            int index2=st2.charAt(i)-'a';
            freq[index2]--;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                System.out.println("Not an anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}