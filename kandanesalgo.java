public class kandanesalgo {
    public static void main(String args[]){
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int n=arr.length;
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=i;j<n;j++){
        //         sum+=arr[j];
        //         max=Math.max(max,sum);
        //     }
        // }
        // System.out.println(max);
        int sum=0;
        int max=Integer.MIN_VALUE;
        int start=-1;
        int arrstart=-1;
        int end=-1;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>max){
                max=sum;
                end=i;
                arrstart=start;
            }
            if(sum<0){
                sum=0;
                start=i+1;
            }
        }
        System.out.println(max);
        for(int i=arrstart;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
