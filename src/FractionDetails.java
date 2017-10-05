
package fraction;

import javax.swing.*;
public class FractionDetails {
    
    public static void main(String[] args) 
    {
        
        int numerator, denominator;
        String Input = JOptionPane.showInputDialog("A. Add \nS. Subtract \nM. Multiply \nD. Divide");
        numerator = Integer.parseInt(JOptionPane.showInputDialog("enter numerator"));
        denominator = Integer.parseInt(JOptionPane.showInputDialog("enter denominator"));
        Fraction f1 = new Fraction(2,6);
        Fraction f2 = new Fraction(numerator,denominator);
        String input = Input.toUpperCase();
        char ch = input.charAt(0);
        
        Fraction fAns = new Fraction();
        
        switch(ch)
                {
            case 'A':
                fAns.add(f1, f2);
                JOptionPane.showMessageDialog(null, fAns.toString());
                break;
                
            case 'S':
                fAns.sub(f1, f2);
                JOptionPane.showMessageDialog(null, fAns.toString());
                break;
                }
        
    }
    
}
