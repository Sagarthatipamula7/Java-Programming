public class reversinginnerstr {
    public static void reverse(int start,int end,char str[]){
        while(start<end){
            char temp=str[start];
            str[start]=str[end];
            str[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        String str="My Name Is Sagar";
        int n=str.length();
        char st[]=str.toCharArray();
        int startindex=0;
        int endinx=0;
        while(endinx<=n){
            if(endinx==n || st[endinx]==' '){
                reverse(startindex, endinx-1, st);
                startindex=endinx+1;
                endinx++;
            }
            else{
                endinx++;
            }
        }
        System.out.println(new String(st));
    }
}
