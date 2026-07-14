package Basics._2_Conditional_loops;

import java.util.Scanner;

public class CheckLeap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%4==0 ||year%400==0){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
    }
}
