public class maxsubarrsum {
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int n=arr.length;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                max_sum=Math.max(sum,max_sum);
            }
        }
        System.out.println(max_sum);
    }
}
