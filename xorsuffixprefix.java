public class xorsuffixprefix {
    public static void main(String args[]){
        int arr[]={1, 2, 6, 2};
        int n=arr.length;
        int prexor[]=new int[n];
        int sufxor[]=new int[n];
        prexor[0]=arr[0];
        sufxor[n-1]=arr[n-1];
        for(int i=1;i<n;i++){
            prexor[i]=prexor[i-1]^arr[i];
        }
        for(int i=n-2;i>=0;i--){
            sufxor[i]=sufxor[i+1]^arr[i];
        }
        for(int i=0;i<n-1;i++){
            if(prexor[i]>sufxor[i+1]){
                System.out.println(i);
                return;

            }
        }
    }
}
