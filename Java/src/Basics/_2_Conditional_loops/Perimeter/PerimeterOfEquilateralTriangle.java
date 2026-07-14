package Basics._2_Conditional_loops.Perimeter;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side: ");
        double side = sc.nextDouble();

        System.out.println("Perimeter = " + (3 * side));
    }
}