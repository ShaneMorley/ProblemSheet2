import javax.swing.*;
public class Library
{

    public static void main(String[] args)
    {
       Book C = new Book();
       C.setTitle(JOptionPane.showInputDialog("please enter book title."));
       C.setISBN(JOptionPane.showInputDialog("please enter book ISBN."));
       C.setPages(Integer.parseInt(JOptionPane.showInputDialog("please enter page amount.")));
       C.setPrice(Float.parseFloat(JOptionPane.showInputDialog("please enter a price")));

       JOptionPane.showMessageDialog(null, C.toString());
    }
}
