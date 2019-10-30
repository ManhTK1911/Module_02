public class PrimeNumberLess100 {
    public static void main(String[] args) {
        int i = 2;
        while (i<100){
            if (Prime.isPrime(i)){
                System.out.print(i + " ");
                i++;
            }
            else i++;
        }
    }
}
