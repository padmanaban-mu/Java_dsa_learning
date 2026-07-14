package Basics._1_Basic_program;

import java.util.Scanner;

public class CurrencyToRupees {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double exchangeRate=96.19;
        System.out.print("Enter the Indian rupees : ");
        double rupees=sc.nextDouble();

        double currency=rupees/exchangeRate;
        System.out.printf("Equivalent Currency in Dollars: %.2f",currency);
    }
}
