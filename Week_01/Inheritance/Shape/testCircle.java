package Week_01.Inheritance.Shape;

import javafx.scene.shape.Circle;

public class testCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, 3.5, 5);
        System.out.println(circle);
    }
}
