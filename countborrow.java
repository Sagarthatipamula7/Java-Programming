import java.nio.channels.Pipe.SourceChannel;

public class countborrow {
    public static void main(String[] args) {
        int minued=1000000;
        int subtractend=99999;
        int carry=0;
        int borrow=0;
        StringBuilder res=new StringBuilder();
        while(minued>0 || subtractend>0){
            int d1=minued%10;
            int d2=subtractend%10;
            d1=d1-carry;
            if(d1<d2){
                carry=1;
                borrow++;
                d1+=10;
            }
            else{
                carry=0;
            }
            minued/=10;
            subtractend/=10;
            int diff=d1-d2;
            res.append(diff);
        }
        System.out.println(res.reverse());
        System.out.println(borrow);
    }
}
