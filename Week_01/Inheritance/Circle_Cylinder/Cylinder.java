package Circle_Cylinder;

public class Cylinder extends CircleV2 {
    private  double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return height*super.getArea();
    }

    @Override
    public String toString() {
        return "A Cylinder with radius="
                + getRadius() + ", color is "
                + getColor() + ", height= "
                + getHeight() + ", and volume= "
                + getVolume() + ", which is a subclass of "
                + super.toString();
    }
}