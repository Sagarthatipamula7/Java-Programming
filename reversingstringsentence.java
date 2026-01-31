public class reversingstringsentence {
    public static void main(String[] args) {
        String str="            My      Name     is   sagar        ";
        int stinx=str.length()-1;
        StringBuilder res=new StringBuilder();
        while(stinx>=0){
            while(stinx>=0 && str.charAt(stinx)==' '){
                stinx--;
            }
            if(stinx<0){
                break;
            }
            int endinx=stinx;
            while(stinx>=0 && str.charAt(stinx)!=' '){
                stinx--;
            }
            res.append(str.substring(stinx+1,endinx+1));
            res.append(" ");
        }
        System.out.println(res.toString());
    }
}
