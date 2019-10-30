import java.util.Scanner;

public class PrintFigure {
    public static void main(String[] args) {
        Scanner input = new java.util.Scanner(System.in);
        int choice = -1;
        int collum, row, height, width;

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter collum:");
                    collum = input.nextInt();
                    System.out.println("Enter row:");
                    row = input.nextInt();
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < collum; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                case 2:
                    System.out.println("Enter height:");
                    height = input.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                case 3:
                    System.out.println("Enter width:");
                    width = input.nextInt();
                    for (int i = width; i >= 0; i--) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
            }
        }
    }
}
