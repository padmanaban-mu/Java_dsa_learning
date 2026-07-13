package Basics._3_functions;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPrime(n)){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a Prime Number");
        }
    }
    public static boolean isPrime(int n){
        if(n==1){
            return true;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
