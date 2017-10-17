import javax.swing.*;

public class FilmDetails
{

    public static void main(String[] args)
    {
      Film[] Collection = new Film[10];
        JTextArea text = new JTextArea();
        do
        {
            String Title = JOptionPane.showInputDialog("Film Title:");
            String Director = JOptionPane.showInputDialog("Film Director:");
            int Min = Integer.parseInt(JOptionPane.showInputDialog("Film Runtime:"));
            Film Filmerino = new Film(Title, Director, Min);
            Collection[Film.getCreated()] = Filmerino;
            Film.setCreated();
        }while(Film.getCreated() < 3);

        text.append(displayFilms(Collection));

        JOptionPane.showMessageDialog(null, text);

    }
public static String displayFilms(Film[] obs)
{
String output = "Number of films: " + Film.getCreated() + "\n\n";

for (int i = 0; i < 3; i++)
{
    output += obs[i].toString();
}
return output;
}
}
