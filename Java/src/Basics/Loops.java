package Basics;
//import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        int n=5;
        /* forLoop
        for(initialization;condition;increment/decrement){
        //block
        }
        end loop;
         */
//1.for loop can be used when we know how many times a loop can run
        System.out.println("For Loop:");
        for(int i=0;i<n;i++){
            System.out.println(i);
        }
//2.While loop can be used when we don't know how many a loop can run
        System.out.println("While Loop:");
        int num=n;
        while(num>0){
            System.out.println(num);
            num--;
        }

        //3.Do-while Loop:- loop should run atleast once no matter whether it matches condition or not
        System.out.println("Do-While Loop:");
        int i=0;
        do{
            System.out.println(i);
            i++;
        }while(i<n);
    }
}
