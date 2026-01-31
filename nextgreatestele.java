import java.util.*;
public class nextgreatestele {
    public static void main(String[] args) {
        int arr[]={1,3,5,6,2,3,7,8,9,7};
        int n=arr.length;
        int nge[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty())nge[i]=-1;
            else nge[i]=st.peek();
            st.push(arr[i]);
        }
        for(int i=0;i<n;i++){
            System.out.print(nge[i]+" ");
        }
    }
}
