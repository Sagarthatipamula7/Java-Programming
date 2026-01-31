
class BinarySearchon2d{
    public static void main(String[] args) {
        int n=3;
        int m=5;
        int mat[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        int low=0;
        int high=n*m-1;
        int target=15;
        while(low<=high){
            int mid=low+(high-low)/2;
            int row=mid/m;
            int col=mid%m;
            if(mat[row][col]==target){
                System.out.println(row+" "+col);
                return;
            }
            else if(mat[row][col]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
    }
}