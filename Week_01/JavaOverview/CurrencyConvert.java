package JavaOverview;

import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        double money = 1.0;
        double rate = 1.0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rate: ");
        rate = input.nextDouble();

        System.out.println("Enter the amount (USD): ");
        money = input.nextInt();

        double convertToVnd = money * rate;
        System.out.println(money + " USD equal " + convertToVnd + " VNd");
        }
    }
