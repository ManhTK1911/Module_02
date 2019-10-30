import java.util.Scanner;

public class CharInString {
    public static void main(String[] args) {
        String string;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        string = scanner.nextLine();
        System.out.println("Enter a character: ");
        char chart = scanner.nextLine().charAt(0);

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chart) {
                count++;
            }
        }

        System.out.println("The number of occurrences of  '" + chart + "' in '" + string + "' is: " + count);
    }
}
//    public static void main(String[] args) {
//        String string;
//        char chart;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter a string: ");
//        string = scanner.nextLine();
//
//        for (int i = 0; i < string.length(); i++) {
//            chart = string.charAt(string.length() - i - 1);
//
//            if (string.charAt(i) == chart) {
//                System.out.println("Panlyndrome!");
//                break;
//            } else {
//                System.out.println("NOT Panlyndrome!");
//                break;
//            }
//        }
//    }