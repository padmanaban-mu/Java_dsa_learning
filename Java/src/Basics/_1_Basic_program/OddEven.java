package Basics._1_Basic_program;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //1.usual way
        if (n % 2 == 0) {
            if (((n / 2) + (n / 2)) == n) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }
            //2.works in integer;
            if (((n / 2) + (n / 2)) == n) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }

            //3.works without modulus((n/2)*2==n)
            //4.bitwiose((n&1)==0)
        }
    }
}
