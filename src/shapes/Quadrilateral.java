package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
//    This class should have: protected properties for length and width.
    protected double length;
    protected double width;

//    a constructor that accepts two numbers for the length and width and sets those properties.
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //        methods for getting the length and width.
    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

//    abstract methods for setting the length and width.
    public abstract void setLength(double length);
    public abstract void setWidth(double width);

}
