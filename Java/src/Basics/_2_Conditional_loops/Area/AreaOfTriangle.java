package Basics._2_Conditional_loops.Area;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double breadth=sc.nextDouble();
        double height= sc.nextDouble();
        System.out.println((0.5*breadth*height));
    }
}
