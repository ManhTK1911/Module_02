package Week_01.Inheritance.Shape;

public class Rectangle extends Week_01.Inheritance.Shape.Shape {
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle(){
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(double width, double height){
        return width*height;
    }

    public double getParameter(double width, double height){
        return 2*width*height;
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and height="
                + getHeight()
                + ", which is a subclass of "
                + super.toString();
    }
}
