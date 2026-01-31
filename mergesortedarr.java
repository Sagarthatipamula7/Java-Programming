
public class mergesortedarr {
    public static void main(String[] args) {
        int arr1[]={1,4,9,10,11,0,0,0,0,0};
        int m=5;
        int arr2[]={2,3,5,7,14};
        int n=arr2.length;
        int p1=m-1;
        int p2=n-1;
        int k=m+n-1;;
        while(p1>=0 && p2>=0){
            if(arr1[p1]>arr2[p2]){
                arr1[k--]=arr1[p1--];
            }
            else{
                arr1[k--]=arr2[p2--];
            }
        }
        while(p1>=0){
            arr1[k--]=arr1[p1--];
        }
        while(p2>=0){
            arr1[k--]=arr2[p2--];
        }
        for(int i=0;i<=m+n-1;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
