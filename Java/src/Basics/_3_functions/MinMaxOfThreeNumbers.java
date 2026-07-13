package Basics._3_functions;

import java.util.Scanner;

public class MinMaxOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Minimum is: "+findMin(a,b,c));
        System.out.println("Maximum is: "+findMax(a,b,c));
    }
    public static int findMin(int a,int b,int c){
        return Math.min(a,Math.min(b,c));
    }
    public static int findMax(int a,int b,int c){
        return Math.max(a,Math.max(b,c));
    }
}
