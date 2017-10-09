package fraction;

import javax.swing.*;
public class FractionDetails {
    
    public static void main(String[] args) 
    {
        Fraction fAns;
        int numerator, denominator;
        String Input = JOptionPane.showInputDialog("A. Add \nS. Subtract \nM. Multiply \nD. Divide");
        numerator = Integer.parseInt(JOptionPane.showInputDialog("enter numerator"));
        denominator = Integer.parseInt(JOptionPane.showInputDialog("enter denominator"));
        Fraction f1 = new Fraction(1,2);
        Fraction f2 = new Fraction(numerator,denominator);
        String input = Input.toUpperCase();
        char ch = input.charAt(0);
        
        
        
        switch(ch)
                {
            case 'A':
                fAns = f1.add(f2);
                JOptionPane.showMessageDialog(null, fAns.toString());
                break;
                
            case 'S':
                fAns = f1.sub(f2);
                JOptionPane.showMessageDialog(null, fAns.toString());
                break;
                
                case 'M':
                fAns = f1.multi(f2);
                JOptionPane.showMessageDialog(null, fAns.toString());
                break;
                
            case 'D':
                fAns = f1.div(f2);
                JOptionPane.showMessageDialog(null, fAns.toString());
                break;
                }
        
    }
    
}