public class Question7Part2 {

    private String deck, name;
    private int count, inhand;

    public void setDeck(String deck)
    {
        this.deck = deck;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setInhand(int inhand) {
        this.inhand = inhand;
    }

    public String getDeck() {
        return deck;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public int getInhand() {
        return inhand;
    }


    public String toString(String cards) {
        String Details = "Player name: " + getName() + "\nDeck Name: " + getDeck() + "\nDeck Count: " + getCount() + "\nCards in hand: " + getInhand() + "\n" + cards;

        return Details;
    }

    public Question7Part2(String deck, String name, int count, int hand)
    {

        setDeck(deck);
        setName(name);
        setCount(count);
        setInhand(hand);

    }

}
