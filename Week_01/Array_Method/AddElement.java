package Week_01.Array_Method;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index;
        int element;
        int [] newArray;

        System.out.println("Enter element:");
        element = scanner.nextInt();

        System.out.println("Enter index:");
        index = scanner.nextInt();

        if (index < 0 || index > (arr.length - 1))
            System.out.println("Cannot insert!!!");
        else {
            System.out.print("Old array is: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            newArray = new int[arr.length+1];
            for (int i = 0; i < index; i++) {
                newArray[i] = arr[i];
            }
            newArray[index] = element;
            for (int i = (index + 1); i < (arr.length+1); i++) {
                newArray[i] = arr[i-1];
            }
            System.out.print("New array is: ");
            for (int j = 0; j < newArray.length; j++){
                System.out.print(+ newArray[j] + "\t");
            }
        }
    }
}
