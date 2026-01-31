import java.util.*;

public class stringintext {
    public static void main(){
        String str="ab123cd45ef67gh8";
        int n=str.length();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(Character.isDigit(i)){
                int j=i;
                while(j<n && Character.isDigit(j)){
                    j++;
                }
                String num=str.substring(i,j).replaceFirst("^0+","");
                if(num.isEmpty()) num="0";
                list.add(num);
                i=j-1;
            }
        }
        int count=0;
        for(int i=0;i<list.size()-1;i++){
            String first=list.get(i);
            String last=list.get(i+1);
            if(first.charAt(first.length()-1)!=last.charAt(0)){
                count++;
            }
        }
        System.out.println(count);
    }
}
