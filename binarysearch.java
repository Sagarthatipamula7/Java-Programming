
public class binarysearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,4,4,4,4,5,8,10,13};
        int n=arr.length;
        int key=10;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==key){
                System.out.println(mid);
                return;
            }
            else if(arr[mid]<key){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
    }
}
