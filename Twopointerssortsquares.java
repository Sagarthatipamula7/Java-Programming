public class Twopointerssortsquares {
    public static void main(String[] args) {
        int arr[]={-10,-3,-2,1,4,5};
        int n=arr.length;
        int ans[]=new int[n];
        int left=0;
        int right=n-1;
        int k=n-1;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k--]=arr[left]*arr[left];
                left++;
            }
            else{
                ans[k--]=arr[right]*arr[right];
                right--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
