import java.util.Scanner;

public class MaxValueInTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = {{1, 2, 3, 4}, {2, 3, 4, 5}, {3, 4, 5, 6}};
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j]>max){
                    max = array[i][j];
                }
            }
        }
        System.out.println("Max value in array is: " + max);
    }
}
