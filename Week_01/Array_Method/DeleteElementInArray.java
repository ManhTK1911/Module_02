import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {2, 3, 2, 5, 2};
        System.out.print("Old array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        int value;
        System.out.println();
        System.out.print("Enter value:");
        value = scanner.nextInt();
        int count = 0;
        int[] newArray;
        int y = 0;
        newArray = new int[array.length];
        for (int j = 0; j < array.length; j++) {
            if (array[j] == value) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println(+value + " NOT in array");
        } else {
            for (int x = 0; x < array.length; x++) {
               if (array[x]!=value){
                   newArray[y]=array[x];
                   y++;
               }
            }

            System.out.print("New array is: ");
            for (int i = 0; i < array.length - count; i++) {
                System.out.print(newArray[i] + "\t");
            }
        }
    }
}
