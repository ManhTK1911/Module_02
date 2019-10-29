import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
            if (isPrime(number))
                System.out.println(number + " is a prime");
            else
                System.out.println(number + " is not a prime");
        }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        } else {
            int i = 2;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    return false;
                }
                i++;
            }
            return true;
        }
    }
}
