import javax.swing.*;
public class MyPoint {

    public static void main(String[] args)
    {
    int x = 5, y = 15,X,Y;
    X = Integer.parseInt(JOptionPane.showInputDialog("translate x by"));
        Y = Integer.parseInt(JOptionPane.showInputDialog("translate y by"));

        MyPointDriver input = new MyPointDriver(x,y,X,Y);

        JOptionPane.showMessageDialog(null, input.toString());
    }

}
