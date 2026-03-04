package pro1;

public class NumericUtils {

    public static long gcd(long a,long b){
        long p = a;
        long q = b;
        while(true){
            if(q==0)
                return p;
            long oldQ=q ;
            q=p%q;
            p=oldQ;



        }
    }
}