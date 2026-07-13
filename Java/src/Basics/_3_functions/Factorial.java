package Basics._3_functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int factorial=factorialValue(n);
        System.out.println(factorial);
    }
    public static int factorialValue(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int fact=1;
        while(n>0){
            fact*=n;
            n--;
        }
        return fact;
    }
}
