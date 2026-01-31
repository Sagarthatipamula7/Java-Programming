public class stringcontains{
    public static void main(String[] args) {
        String haystack="adosadjfskfasjfj";
        String needle="sad";
        int ind=0;
        if(haystack.contains(needle)){
            ind= haystack.indexOf(needle.charAt(0));
        }
        System.out.println(ind);
    }
}