package shapes;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * (Math.pow(radius, 2));
    }

    public double getCircumrence(){
        return 2 * Math.PI * this.radius;
    }

}