public class variation1optimal {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,19,34};
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                max=Math.max(max,arr[j]);
                min=Math.min(min,arr[j]);

                if((max-min+1)==(j-i+1)){
                    ans=Math.max(ans,j-i+1);
                }
            }
        }
        System.out.println(ans);
    }
}
