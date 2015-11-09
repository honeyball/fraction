public class Fraction {
    int n, d;

    Fraction (int num, int den)
    {
        n = num;
        d = den;
    }
    void Simplify()
    {
        n = n / nod(n,d);
        d = d / nod(n,d);
    }

    public String toString()
    {
        return n + "/" + d;
    }
    public Fraction add(Fraction x)
    {
        return new Fraction(n * nok(d,x.d) + x.n * nok(d,x.d), nok(d,x.d));
    }
    
    public Fraction sub(Fraction x)
    {
    	return new Fraction(n * nok(d,x.d) - x.n * nok(d,x.d), nok(d,x.d));
    }
    
    public Fraction mul(Fraction x)
    {
        return new Fraction(n*x.n, d*x.d);
    }
    
    public Fraction div(Fraction x)
    {
        return new Fraction(n*x.d, d*x.n);
    }

    private static int nod(int a, int b) {
        if (b == 0) return a;
        int x = a % b;
        return nod(b, x);
    }
    
    private static int nok(int a,int b){
    	return (a * b) / (nod(a,b));
    }
}
