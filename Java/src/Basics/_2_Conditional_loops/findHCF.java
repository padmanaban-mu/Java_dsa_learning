package Basics._2_Conditional_loops;

import java.util.Scanner;

public class findHCF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int min=Math.min(a,b);
        for(int i=1;i<=min;i++){
            if(a%i==0&&b%i==0){
                System.out.print(i+" ");
            }
        }
       // System.out.println(findHcf(a,b));
    }
//    public static int findHcf(int a,int b){
////       if(b==0){
////           return a;
////       }
////        return findHcf(b,a%b);
    //a=Math.abs(a);
    //b=Math.abs(b);
//        while(b!=0){
//            int temp=b;
//            b=a%b;
//            a=temp;
//        }
//        return a;
//    }
}
