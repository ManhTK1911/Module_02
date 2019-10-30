import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int num1, num2;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        num1 = input.nextInt();

        System.out.println("Enter number 2: ");
        num2 = input.nextInt();

        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        if (num1 == 0 || num2 == 0)
            System.out.println("No greatest common divisor");

        while (num1 != num2) {
            if (num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }
        System.out.println("Greatest common divisor: " + num1);
    }
}
