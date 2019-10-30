package Week_01.Interface_AbstractClass.Resizeable;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(6.0,"red",false);
        System.out.println("Before resize:");
        System.out.println(c);

        c.reSize(2);
        System.out.println("After resize:");
        System.out.println(c);
        
    }
}
