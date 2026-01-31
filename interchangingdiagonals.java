public class interchangingdiagonals {
    public static void main(String[] args) {
        int n=4;
        int m=4;
        int mat[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for(int i=0;i<n;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==j){
                    int temp=mat[i][j];
                    mat[i][j]=mat[i][m-i-1];
                    mat[i][m-i-1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
