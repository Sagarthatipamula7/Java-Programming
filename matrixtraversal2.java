public class matrixtraversal2 {
    public static void main(String[] args) {
        int n=4;
        int m=5;
        int mat[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for(int j=0;j<mat[0].length;j++){
            if(j%2==0){
                for(int i=0;i<n;i++){
                    System.out.print(mat[i][j]+" ");
                }
            }
            else{
                for(int i=n-1;i>=0;i--){
                    System.out.print(mat[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
