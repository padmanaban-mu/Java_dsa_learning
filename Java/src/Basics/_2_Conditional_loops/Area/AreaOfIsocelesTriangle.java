package Basics._2_Conditional_loops.Area;

import java.util.Scanner;
//equal length and equal base angle measure
public class AreaOfIsocelesTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double side=sc.nextDouble();//length
        double base=sc.nextDouble();//base measure
        double height=Math.sqrt(side*side-(base*base)/4);// to findheight
        double area=0.5*base*height;
        System.out.println(area);
    }
}
