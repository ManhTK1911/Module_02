package Week_01.Inheritance.Shape;

public class testRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle("green", true, 2.5, 3.8);
        System.out.println(rectangle);
    }
}
