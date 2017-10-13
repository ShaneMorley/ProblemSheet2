
package vendingmachine;
import javax.swing.*;
public class VendingMachine {


    public static void main(String[] args) {
        char ch;
        MachineContents Mach = new MachineContents();
        do
        {
        String input = JOptionPane.showInputDialog("Please select option");
        ch = input.charAt(0);
        
        switch (ch)
        {
            
            case 'p':
            int Cans = Integer.parseInt(JOptionPane.showInputDialog("Enter cans wanted"));
       while(Cans > Mach.getCans())
            Cans = Integer.parseInt(JOptionPane.showInputDialog("error to many cans!"));
       
            Mach.subCans(Cans);
            Mach.setTokens(Cans);
                break;
                
            case 'r':
                
            Cans = Integer.parseInt(JOptionPane.showInputDialog("Enter cans placed in machine"));
            Mach.addCans(Cans);
            break;
            
            case 'd':
            JOptionPane.showMessageDialog(null, Mach.toString());
            break;
        }
       
    }while(ch != 'q');
      JOptionPane.showMessageDialog(null, "Thank you for your patronage.");
      System.exit(0);
  } 
}
