public class ceil {
    public static void main(String[] args) {
        int arr[]={1,2,3,6,8,9,11,13,14,17};
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=-1;
        int x=10;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=x){
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
