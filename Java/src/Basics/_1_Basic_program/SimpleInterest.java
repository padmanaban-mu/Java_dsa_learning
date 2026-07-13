package Basics._1_Basic_program;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int principal=sc.nextInt();
        double time=sc.nextDouble();
        double rate=sc.nextDouble();
        double si=(double)((principal*time*rate)/100);
        System.out.println(si);
    }
}
