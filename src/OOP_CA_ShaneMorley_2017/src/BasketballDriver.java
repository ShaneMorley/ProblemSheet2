import javax.swing.*;
public class BasketballDriver
{

    public static void main(String[] args)
    {
        BasketBaller[] Team = new BasketBaller[5];
        int TeamCount = 0;
        while(TeamCount < 5)
        {
            String name = JOptionPane.showInputDialog("Player Name:");
            int age = Integer.parseInt(JOptionPane.showInputDialog("Player age:"));
            double height = Double.parseDouble(JOptionPane.showInputDialog("Player Height in metres:"));
            BasketBaller Player = new BasketBaller(name,age,height);
            Team[TeamCount] = Player;
            JOptionPane.showMessageDialog(null,Team[TeamCount].toString());
            TeamCount++;
        }
        display(Team);
        BasketBaller tallestPlayer = selecttallestPlayer(Team);
        JOptionPane.showMessageDialog(null, tallestPlayer.toString());
        JOptionPane.showMessageDialog(null,Convert.convertToFeet(Team), "Players height in feet and inches",JOptionPane.INFORMATION_MESSAGE);
    }

    public static void display(BasketBaller[] team)
    {
        JTextArea output = new JTextArea();
        int count = 0;
        output.append("Team:");
        while(count < 5)
        {
            output.append(team[count].toString());
            count++;
        }
        JOptionPane.showMessageDialog(null, output,"Message",JOptionPane.INFORMATION_MESSAGE);
    }

    public static BasketBaller selecttallestPlayer(BasketBaller[] team)
    {
        int count = 0;
        BasketBaller HeightTest = new BasketBaller();
        BasketBaller tallest = HeightTest;
        double tall = HeightTest.getHeight();
        while(count < 5)
        {
            if (team[count].getHeight() > tall && count == 0)
            {
                tall = team[count].getHeight();
                tallest = team[count];
            }
            else if(team[count].getHeight() > tall && count > 0) {
                tall = team[count].getHeight();
                tallest = team[count];
            }
            count++;
        }
        return tallest;
    }
}
