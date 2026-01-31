public class movehash {
    public static void main(String args[]){
        String str="abc##d#e##f#g";
        StringBuilder hash = new StringBuilder();
        StringBuilder chars = new StringBuilder();
        for(char c:str.toCharArray()){
            if(c=='#')hash.append(c);
            else chars.append(c);
        }
        System.out.println(hash.append(chars));
    }
}
