import java.nio.channels.Pipe.SourceChannel;

public class Prefix1 {
    // User function Template for Java
    public static void main(String args[]) {
        int l=3;
        int r=5;
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int prefix[]=new int[n+1];
        for(int i=1;i<=n;i++){
            prefix[i]=prefix[i-1]^i;
        }
        for(int i=1;i<=n;i++){
            System.out.print(prefix[i]+" ");
        }
        System.out.println();
        System.out.println(prefix[r]^prefix[l-1]);
    }
}
