import java.net.SocketTimeoutException;

public class sorting0s1s{
    public static void main(String args[]){
        int arr[]={1,1,1,1,1,0,0,0,0,0,1,1,1,1,0};
        int n=arr.length;
        int p1=0;
        int p2=n-1;
        while(p1<p2){
            if(arr[p1]==0){
                p1++;
            }
            else if(arr[p2]==1){
                p2--;
            }
            if(arr[p1]>arr[p2]){
                int temp=arr[p1];
                arr[p1]=arr[p2];
                arr[p2]=temp;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
