package lv.javaguru.lesson3.circle;

public class CircleTest {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        circle1.setRadius(3);

        System.out.println("Area of the circle is: " + circle1.calculateArea());
    }
}
