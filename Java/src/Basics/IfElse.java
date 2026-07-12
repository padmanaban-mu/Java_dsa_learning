package Basics;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //if-Else
        /*
        if(condition){
        //block;
        }else{
        //block;
         */
        System.out.print("Enter your Salary: ");
        int salary=sc.nextInt();
//        if(salary>=30000){
//            salary+=2000;
//        }else{
//            salary+=1000;
//        }
//        System.out.println("Updated Salary: "+salary);

        //2.Multiple conditional statements;
        /*if(condition){
        //block;
        }else if(condition){
        //block;
        }else{
        //block;
        }
         */

        //3.Nested if
        /* if(conditon){
            if(condition){
                if(condition){
                //block;
                }
                }
                }
           else{
           //block;
         */
        if(salary>10000){
            if(salary<30000){
                if(salary>=20000 && salary<=28000){
                    salary+=5000;
                }else{
                    salary+=2500;
                }
            }else{
                salary+=1500;
            }
        }
        else{
            salary+=500;
        }
        System.out.println("Updated Salary: "+salary);
    }
}
