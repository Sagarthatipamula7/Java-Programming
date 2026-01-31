

public class prefixsum1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
        int prefix[]=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(prefix[i]+" ");
        }
        System.out.println();
        int suffix[]=new int[n];
        suffix[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1]+arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(suffix[i]+" ");
        }
    }
}
