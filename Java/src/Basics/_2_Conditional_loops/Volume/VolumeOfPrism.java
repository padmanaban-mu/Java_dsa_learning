package Basics._2_Conditional_loops.Volume;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base area: ");
        double baseArea = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        System.out.println("Volume = " + (baseArea * height));
    }
}