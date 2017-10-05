
package fraction;


public class Fraction {

    private int Numerator, Denominater;
    int numResult, denomResult;
    public void setNumerator(int Numerator)
    {
        this.Numerator = Numerator;
    }
    
    public void setDenominator(int Denominator)
    {
        this.Denominater = Denominator;
    }
    
    public int getNumerator()
    {
        return Numerator;
    }
    
    public int getDenominator()
    {
        return Denominater;
    }  
    
    public Fraction sub(Fraction f1,Fraction f2)
    {
        setNumerator(f1.Numerator*f2.Denominater - f1.Denominater*f2.Numerator);
        setDenominator(f1.Denominater * f2.Denominater);
        Fraction fAns = new Fraction(getNumerator(), getDenominator());
        return fAns;
    }
    
    public Fraction add(Fraction f1,Fraction f2)
    {
        setNumerator(f1.Numerator*f2.Denominater + f1.Denominater*f2.Numerator);
        setDenominator(f1.Denominater * f2.Denominater);
        Fraction fAns = new Fraction(getNumerator(), getDenominator());
        return fAns;
    }
    
    public String toString()
    {
        String Output = (getNumerator() + "/" + getDenominator());
        return Output;
    }
        public Fraction()
    {
        
        setNumerator(0);
        setDenominator(1);
        
    }

    public Fraction(int x, int y)
    {
        
        setNumerator(x);
        setDenominator(y);
        
    }
    
}
