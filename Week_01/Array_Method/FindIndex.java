import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name’s student:");
        String input_name = scanner.nextLine();

        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Index of " + input_name + " is " + (i+1));
                count++;
            }
        }
        if (count==0){
            System.out.println("NOT found!");
        }
    }
}
