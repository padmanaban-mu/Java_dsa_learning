package Basics._2_Conditional_loops;

import java.util.Scanner;

public class FutureInvestment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     double amount=sc.nextDouble();
     double rate=sc.nextDouble();
     int years=sc.nextInt();
     double monthly=rate/1200;
     double FutureValue=amount*Math.pow(1+monthly,years*12);
        System.out.println(FutureValue);
    }
}
