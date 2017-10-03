import javax.swing.*;
public class BikeDetails
{

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("bike name");
        String make = JOptionPane.showInputDialog("bike make");
        float value = Float.parseFloat(JOptionPane.showInputDialog("value"));
        Bicycle input1 = new Bicycle(name,make,value);
        Bicycle input2 = new Bicycle();
        String name2 = JOptionPane.showInputDialog("name");
        input2.setOwner2(name2);
        String make2 = JOptionPane.showInputDialog("make");
        input2.setMake2(make2);
        float value2 = Float.parseFloat(JOptionPane.showInputDialog("value:"));


    }

}
