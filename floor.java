public class floor {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7,9,12,13,16,18};
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=-1;
        int x=11;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<=x){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println(arr[ans]);
    }
}
