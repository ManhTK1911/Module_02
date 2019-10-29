public class First20PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        int i = 2;
        while (count < 20) {
            if (Prime.isPrime(i)) {
                System.out.print(i + " ");
                i++;
                count++;
            }
            else i++;
        }
    }
}