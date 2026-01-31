public class stringpalindrome {
    public static void main(String args[]){
        String str="A man, a plan, a canal: Panama";
        String ans=str.toLowerCase().replaceAll("[^a-z0-9]", "");
        String rev=new StringBuilder(ans).reverse().toString();
        if(ans.equals(rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
