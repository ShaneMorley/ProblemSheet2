/**
 * Created by t00196165 on 28/09/2017.
 */
public class Fraction {
    int numerator,denominator;

    public Fraction()
    {
       // ...
    }

    public Fraction(int x,int y)
    {
        numerator = x;
        denominator = y;
    }

    public Fraction add(Fraction f)
    {
        int numeratorResult, denomResult;

        numeratorResult = this.numerator*f.denominator + this.denominator*f.numerator;
        denomResult = this.denominator * f.denominator;

        return new Fraction(numeratorResult,denomResult);
    }

    public String toString()
    {
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(1,6);
        Fraction f2 = new Fraction(2,6);

        Fraction result = f1.add(f2);
        System.out.println(result);

        Fraction f3 = new Fraction();
        System.out.println(f3);
    }
}
