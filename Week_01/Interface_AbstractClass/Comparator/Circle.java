package Week_01.Interface_AbstractClass.Comparator;

public class Circle {
    private String color;
    private double radius;
    private boolean filler;

    public Circle(){
    };

    public Circle(boolean filler, double radius, String color) {
        this.color = color;
        this.radius = radius;
        this.filler = filler;
    }

    public Circle(double radius) {
    }

    public boolean isFiller() {
        return filler;
    }

    public void setFiller(boolean filler) {
        this.filler = filler;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return "Circle with color of:"
                + getColor() + ", radius is:"
                + getRadius() + " and filler is:"
                + (isFiller() ? "filler" : "not filler");
    }
}
