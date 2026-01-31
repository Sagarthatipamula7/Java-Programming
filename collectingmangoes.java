import java.util.*;
public class collectingmangoes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++){
            int n=sc.nextInt();
            sc.nextLine();
            Stack<Integer>st=new Stack<>();
            Stack<Integer>max=new Stack<>();
            System.out.println("case"+k+":");
            for(int i=0;i<n;i++){
                String parts[]=sc.nextLine().split(" ");
                if(parts[0].equals("A")){
                    int x=Integer.parseInt(parts[1]);
                    st.push(x);
                    if(max.isEmpty() || x>=max.peek()){
                        max.push(x);
                    }
                }
                else if(parts[0].equals("R")){
                    if(st.isEmpty()){
                        System.out.println("Empty");
                    }
                    if(!max.isEmpty() && st.pop()==max.peek()){
                        max.pop();
                    }
                }
                else{
                    if(max.isEmpty()){
                        System.out.println("Empty");
                    }
                    else{
                        System.out.println(max.peek());
                    }
                }
            }
        }
    }
}
