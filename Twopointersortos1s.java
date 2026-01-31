public class Twopointersortos1s {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right){
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
            if(arr[left]%2==1 && arr[right]%2==0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
