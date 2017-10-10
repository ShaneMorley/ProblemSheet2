import javax.swing.*;
public class Question7 {

    public static void main(String[] args) {
String player = JOptionPane.showInputDialog("Player Name:");
String deck = JOptionPane.showInputDialog("Deck Name:");
int count = Integer.parseInt(JOptionPane.showInputDialog("Deck count:"));
int cardsInHand = Integer.parseInt(JOptionPane.showInputDialog("Cards in hand:"));
       String cards = handGenerator(cardsInHand);
   Question7Part2 output = new Question7Part2(player, deck, count, cardsInHand);

   JOptionPane.showMessageDialog(null, output.toString(cards));
    }

    public static String handGenerator(int cardsInHand)
    {
        String hand = "Hand: ";

        for (int i = 0; i<cardsInHand; i++)
        {

            int j = (int)((Math.random()*3) + 1);

            if(j == 3)
            {
                hand += "Trap card, ";
            }

            if(j == 2)
            {
                hand += "Spell card, ";
            }

            if(j == 1)
            {
                hand += "Monster card, ";
            }
        }

        return hand;
    }

}
