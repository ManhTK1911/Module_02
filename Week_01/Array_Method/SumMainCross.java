import java.util.Scanner;

public class SumMainCross {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[][] array;
        System.out.println("Enter size:");
        size = scanner.nextInt();
        array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]" + " : ");
                array[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        System.out.println("Property list: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();

        }
        for (int i = 0; i < size; i++) {
            sum += array[i][i];
        }
        System.out.println("Sum main cross is: " + sum);
    }
}
//for (int i = 0; i < matrix.length; i++) {
//        for (int j = 0; j < matrix[i].length; j++) {
//        int i1 = (int) (Math.random() * matrix.length);
//        int j1 = (int) (Math.random() * matrix[i].length);
//
//        // Swap matrix[i][j] with matrix[i1][j1]
//        int temp = matrix[i][j];
//        matrix[i][j] = matrix[i1][j1];
//        matrix[i1][j1] = temp;
//        }
//        }