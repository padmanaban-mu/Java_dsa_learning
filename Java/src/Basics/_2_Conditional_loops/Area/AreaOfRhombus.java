package Basics._2_Conditional_loops.Area;
import java.util.*;
public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double diagonal1=sc.nextDouble();
        double diagonal2= sc.nextDouble();
        double area=(diagonal1*diagonal2)/2;
        System.out.println(area);
    }
}
