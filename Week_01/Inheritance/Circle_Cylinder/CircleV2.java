package Circle_Cylinder;

public class CircleV2 {
    private double radius;
    private String color;

    public CircleV2(){
    }

    public CircleV2(double radius, String color) {
        this.radius = radius;
        this.color = color;
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

    public double getArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "A Circle with color of "
                + getColor() + " and radius "
                + getRadius();
    }
}
