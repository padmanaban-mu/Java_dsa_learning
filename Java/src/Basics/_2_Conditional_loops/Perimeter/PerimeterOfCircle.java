package Basics._2_Conditional_loops.Perimeter;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        double perimeter = 2 * Math.PI * r;

        System.out.println("Perimeter = " + perimeter);
    }
}