import java.util.Scanner;

public class LumpedArray {
    public static void main(String[] args) {
        int[] newArray;
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while (i < array1.length) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array1[i] = scanner.nextInt();
            i++;
        }
        System.out.print("First array: ");
        for (int j = 0; j < array1.length; j++) {
            System.out.print(array1[j] + "\t");
        }

        System.out.println();
        int x = 0;
        while (x < array2.length) {
            System.out.print("Enter element " + (x + 1) + " : ");
            array2[x] = scanner.nextInt();
            x++;
        }

        System.out.print("Second array: ");
        for (int j = 0; j < array2.length; j++) {
            System.out.print(array2[j] + "\t");
        }

        newArray = new int[array1.length + array2.length];

        for (int j = 0; j < array1.length; j++) {
            newArray[j] = array1[j];
        }
        for (int j = array1.length; j < array1.length + array2.length; j++) {
            newArray[j] = array2[j - array2.length];
        }

        System.out.print("New array: ");
        for (int j = 0; j < array1.length + array2.length; j++) {
            System.out.print(newArray[j] + "\t");
        }
    }
}
