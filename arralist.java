import java.util.ArrayList;

public class arralist {
    public static void main(String[] args) {
        int n=5;
        ArrayList<Integer>list =new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(i);
        }
        for(int i=0;i<n;i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
