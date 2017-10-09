package fraction;


public class Fraction {

    private int Numerator, Denominater;
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
    
    public Fraction sub(Fraction f2)
    {
        setNumerator(this.Numerator*f2.Denominater - this.Denominater*f2.Numerator);
        setDenominator(this.Denominater * f2.Denominater);
        Fraction fAns = new Fraction(getNumerator(), getDenominator());
        return fAns;
    }
    
    public Fraction add(Fraction f2)
    {
        setNumerator(this.Numerator*f2.Denominater + this.Denominater*f2.Numerator);
        setDenominator(this.Denominater * f2.Denominater);
        Fraction fAns = new Fraction(getNumerator(), getDenominator());
        return fAns;
    }
    
    public Fraction multi(Fraction f2)
    {
        setNumerator(this.Numerator*f2.Numerator);
        setDenominator(this.Denominater * f2.Denominater);
        Fraction fAns = new Fraction(getNumerator(), getDenominator());
        return fAns;
    }
    
    public Fraction div(Fraction f2)
    {
        setNumerator(this.Numerator*f2.Denominater);
        setDenominator(this.Denominater * f2.Numerator);
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