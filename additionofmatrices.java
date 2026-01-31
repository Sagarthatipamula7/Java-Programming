public class additionofmatrices {
    public static void main(String[] args) {
        int n=3;
        int m=3;
        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};        
        int arr2[][]={{1,2,3},{4,5,6},{7,8,9}};  
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[i][j]=arr1[i][j]-arr2[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }      
    }
}
