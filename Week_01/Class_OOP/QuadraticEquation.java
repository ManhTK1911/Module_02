import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.pow((this.b * this.b - 4 * this.a * this.c), 0.5)) / 2 * this.a;
    }
    public double getRoot2() {
        return (-this.b - Math.pow((this.b * this.b - 4 * this.a * this.c), 0.5)) / 2 * this.a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the a:");
        double a = scanner.nextDouble();
        System.out.print("Enter the b:");
        double b = scanner.nextDouble();
        System.out.print("Enter the c:");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        if (quadraticEquation.getDiscriminant()>0){
            System.out.println("The equation has two roots is:" +quadraticEquation.getRoot1()
                    +", " +quadraticEquation.getRoot2());
        }
        else if (quadraticEquation.getDiscriminant()==0){
            System.out.println("The equation has root is:" +quadraticEquation.getRoot1());
        }
        else System.out.println("The equation has no roots");
    }
}
