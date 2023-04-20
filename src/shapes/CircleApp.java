package shapes;

import util.Input;

public class CircleApp {
    //1. Get user input(Where? answer: Input class)
    //2. get circumference and area(Where? Answer: circle class)

    public static void main(String[] args) {
        System.out.println("Enter a radius:");
        double userRadius = Input.getDouble();
        Circle circle = new Circle(userRadius);
        double area = circle.getArea();
        double circumference = circle.getCircumrence();
        System.out.printf("Your circle has a circumference of: %s, and an area of: %s", circumference, area);
    }
}