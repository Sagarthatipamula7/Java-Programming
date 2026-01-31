import javax.swing.SpinnerDateModel;

public class rearrangingvar1 {
//     public static boolean check(ArrayList<Integer> list){
//         for(int i=0;i<list.size()-1;i++){
//             if((list.get(i+1)-list.get(i)!=1)){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         int arr[]={18,12,20,5,3,9,1,2,4,8,7,6,21,24,23};
//         int n=arr.length;
//         int ans=-1;
//         for(int i=0;i<n;i++){
//             ArrayList<Integer> list=new ArrayList<>();
//             for(int j=i;j<n;j++){
//                 list.add(arr[j]);
//                 Collections.sort(list);
//                 if(check(list)){
//                     ans=Math.max(ans,j-i+1);
//                 }
//             }
//         }
//         System.out.println(ans);
//     }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7,6};
        int n=arr.length;
        int ans=-1;
        int start=-1;
        for(int i=0;i<n;i++){
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                max=Math.max(arr[j],max);
                min=Math.min(arr[j],min);

                if((max-min+1)==(j-i+1)){
                    if((j-i+1)>ans){
                        ans=j-i+1;
                        start=i;
                    }
                }
            }
        }
        for(int i=start;i<start+ans;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
