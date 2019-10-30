package Inheritance.Shape;

import Week_01.Inheritance.Shape.Triangle;

import java.util.Scanner;

public class testTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1, side2, side3;
        Triangle triangle = new Triangle();
        triangle = new Triangle("green", false, 1, 1, 1);
        System.out.println(triangle);

        do {
            System.out.print("enter side 1:");
            side1 = scanner.nextDouble();
        } while (side1 > 0);
        do {
            System.out.print("enter side 1:");
            side2 = scanner.nextDouble();
        } while (side2 > 0);
        do {
            System.out.print("enter side 1:");
            side3 = scanner.nextDouble();
        } while (side3 > 0);

        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
            triangle.setSide1(side1);
            triangle.setSide2(side2);
            triangle.setSide3(side3);
            System.out.println(triangle);
        } else System.out.println(" This is NOT 3 side of triangle!");

    }
}
