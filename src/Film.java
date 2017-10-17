public class Film {

    private String Title, Director;
    private int min;
    private static int created = 0;

    public int getMin() {
        return min;
    }

    public String getDirector() {
        return Director;
    }

    public String getTitle() {
        return Title;
    }

    public static int getCreated() {
        return created;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public static void setCreated() {
        created++;
    }

    public String toString()
    {
        String output = "Title: " + getTitle() + "\nDirector: " + getDirector() + "\nRuntime: " + getMin() + " mins\n\n";
        return output;
    }

    public Film()
    {
        setDirector("Unknown");
        setTitle("Unknown");
        setMin(0);
    }

    public Film(String Title, String Director, int min)
    {
        setDirector(Director);
        setTitle(Title);
        setMin(min);
    }

}
