import java.util.Stack;

public class nge {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,4,3,2,2,6,7,5};
        int n=arr.length;
        Stack<Integer> st= new Stack<>();
        int nge[]=new int[n];
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
