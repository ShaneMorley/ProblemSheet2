/**
 * Created by t00196165 on 28/09/2017.
 */
import javax.swing.*;
public class Send {

    public static void main(String[] args) {

        String Message, sender="", recip="";
        sender = JOptionPane.showInputDialog("please enter your name");
        recip = JOptionPane.showInputDialog("Please enter recipiant");
        Message = JOptionPane.showInputDialog("please enter message");
        Message in = new Message(sender, recip);
        in.setSender(sender);
        in.setRecip(recip);
        in.setMessage(Message);
        JOptionPane.showMessageDialog(null, in.toString());
    }

}
