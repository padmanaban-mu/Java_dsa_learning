package Basics._2_Conditional_loops;

import java.util.Scanner;

public class PermutationAndCombination {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        if(n<r||n<0||r<0){
            System.out.println("Invalid");
        }else{
            //calculate npr:
            long nPr=factorial(n)/factorial(n-r);
            long nCr=factorial(n)/(factorial(r)*factorial(n-r));
            System.out.println("Permutation is: "+nPr);
            System.out.println("Combination is: "+nCr);
        }
    }
    public static long factorial(int n){
        long fact=1;
        if(n==0){
            return 1;
        }
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
}
