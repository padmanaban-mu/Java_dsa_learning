package Basics._2_Conditional_loops;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int units=sc.nextInt();
        double totalPrice;
        if(units<=100){
            totalPrice=units*(4.50);
        }else if(units<=200){
            totalPrice=(100*4.50)+(units-100)*6.00;
        }else if(units<=300){
            totalPrice=(100*4.50)+(100*6.00)+(units-200)*8.00;
        }else{
            totalPrice=(100*4.50)+(100*6.00)+(100*8.00)+(units-300)*10.00;
        }
        System.out.println(totalPrice);
    }
}
