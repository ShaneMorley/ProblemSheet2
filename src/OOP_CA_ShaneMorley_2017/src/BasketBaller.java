public class BasketBaller {

    private String name;
    private int age;
    private double height;

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {

        String output = "\n\nName:" + getName() + "\nAge:" + getAge() + " Years old" + "\nHeight:" + getHeight() + " m.";
        return output;
    }

    public BasketBaller()
    {
        setName("Unknown");
        setAge(0);
        setHeight(0.0f);
    }

    public BasketBaller(String name, int age, double height)
    {
        setHeight(height);
        setName(name);
        setAge(age);

    }

}
