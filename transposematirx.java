public class transposematirx {
    public static void main(String args[]){
        int n=3;
        int m=3;
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
