public class MyPointDriver {

    private int X, Y,transX, transY;

    public MyPointDriver(int xVal, int yVal, int TransX, int TransY)
    {

        setX(xVal);
        setY(yVal);
        setTransX(TransX);
        setTransY(TransY);

    }

    public void setX(int X) {
        this.X = X;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public void setTransX(int transX) {
        this.transX = transX;
    }

    public void setTransY(int transY) {
        this.transY = transY;
    }

    public int getTransX() {
        return transX;
    }

    public int getTransY() {
        return transY;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public String translate()
    {
        String Translated;
        Translated = "(" + (getX() + getTransX()) + "," + (getY() + getTransY()) + ")";
        return Translated;
    }

    public float distanceFromOrigin()
    {

        float c = (float) Math.sqrt((getX() * getX()) + (getY() * getY()));
        return c;
    }

    @Override
    public String toString() {
        String output;
        output = "Initial = (" + getX() + "," + getY() + ")\n" + "Translated = " + translate() + "\ndistance from origin = " + distanceFromOrigin();
        return output;
    }
}
