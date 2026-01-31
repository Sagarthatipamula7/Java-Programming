public class primeornot {
    public static void main(String[] args) {
        int n=7;
        // for(int i=2;i*i<=n;i++){
        //     if(n%i==0){
        //         count++;
        //     }
        // }
        // System.out.println(count==0?"Prime":"Not a prime"); for checking prime or not
        // printing prime numbers from 1 to n
        for(int i=2;i<=n;i++){
            int count=0;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    count=1;
                    break;
                }
            }
            if(count==0){
                System.out.print(i+" ");
            }
        }
    }
}
