class bs{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int n=7;
        int target=5;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                System.out.println(mid+" found at this index");
                break;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
    }
}