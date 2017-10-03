public class Bicycle
{
    private String Owner1, Owner2, Make1, Make2;
    private float value1, value2;

    public float getValue1() {
        return value1;
    }

    public float getValue2() {
        return value2;
    }

    public String getMake1() {
        return Make1;
    }

    public String getMake2() {
        return Make2;
    }

    public String getOwner1() {
        return Owner1;
    }

    public String getOwner2() {
        return Owner2;
    }

    public void setMake1(String make1) {
        Make1 = make1;
    }

    public void setMake2(String make2) {
        Make2 = make2;
    }

    public void setOwner1(String owner1) {
        Owner1 = owner1;
    }

    public void setOwner2(String owner2) {
        Owner2 = owner2;
    }

    public void setValue1(float value1) {
        this.value1 = value1;
    }

    public void setValue2(float value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        String output="";

        return output;
    }

    public Bicycle()
    {
       setOwner2("Unknown");
       setMake2("Unknown");
       setValue2(0);
    }

    public Bicycle(String Name, String Make, float Value)
    {
        setMake1(Make);
        setValue1(Value);
        setOwner1(Name);
    }
}
