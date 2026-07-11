package Basics;

import java.util.Scanner;

public class AutomaticConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int a=sc.nextFloat();//gives error bcoz src >=dest here int< float..
        //float c=sc.nextInt(); //here it works because float>int 11 gives 11.0
        //int a=257;byte b=(byte)a;//gives 257%256=1;; bcoz byte size is 256
        int a=56;
        short b=734;
        long c=456789;
        byte d=45;
        float e=85.5f;
        double f=56.90f;

//here which one has high in size gets precedence over in expression..
        System.out.println((int)((a*e)+(d*f)-(c*b)));
    }
}
