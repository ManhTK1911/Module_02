package Inheritance.Shape;

public class testShape {
    public static void main(String[] args) {
        Inheritance.Shape.Shape shape = new Inheritance.Shape.Shape();
        System.out.println(shape);

        shape = new Inheritance.Shape.Shape("red", false);
        System.out.println(shape);
    }
}
