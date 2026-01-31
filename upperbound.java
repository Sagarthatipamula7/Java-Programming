public class upperbound {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,7,8,9,10,12,14};
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=-1;
        int x=13;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(arr[ans]);
    }
}
