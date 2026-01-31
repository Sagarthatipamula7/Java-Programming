public class prefixsuffixxor {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int prefix[]=new int[n];
        int suffix[]=new int[n];
        prefix[0]=arr[0];
        suffix[n-1]=arr[n-1];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
            suffix[n-i-1]=suffix[n-i]+arr[n-i-1];
        }
        for(int ele :prefix){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int ele:suffix){
            System.out.print(ele+" ");
        }
    }
}
