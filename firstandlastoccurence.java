public class firstandlastoccurence {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,4,5,6,7,8,9};
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=-1;
        int target=4;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println(ans);
    }
}
