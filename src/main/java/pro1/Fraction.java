package pro1;

public class Fraction {
    private long n;
    private long d;

    public Fraction(long n, long d) {
        var gcd =NumericUtils.gcd(n, d);
        this.n = n/gcd;
        this.d = d/gcd ;
    }
    public Fraction add(Fraction b) {
        var resN=n*b.d+b.n*d;
        var resD= d*b.d;
        return new Fraction(resN,resD);
    }
    public static Fraction parse(String s) {
        String[] split= s.split("\\+");
        var result=new Fraction(0,1);
        for(var p: split) {
            Fraction f;
            if(p.contains("%")){
                var n = Long.parseLong(p.replace("%","").trim());

                f=new Fraction(n,100) ;
            }
            else{
                var parts=p.split("/");

                f=new Fraction(Long.parseLong(parts[0].trim()),
                        Long.parseLong(parts[1].trim()));
            }
            result= result.add(f);
        }
        return result;
    }

    @Override
    public String toString() {
        return n +"/"+d;
    }
}