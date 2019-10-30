import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        int[] newArray;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        newArray = new int[size];
        for (int x = 0; x < array.length; x++){
            newArray[array.length-x-1] = array[x];
        }

        System.out.print("Reverse array is: ");
        for (int y = 0; y < newArray.length; y++) {
            System.out.print(newArray[y] + "\t");
        }
    }
}
