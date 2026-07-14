package Basics._2_Conditional_loops.Area;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        System.out.println(Math.PI*(r*r));
    }
}
