package Basics;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Scanner is a class from java.util package
        //sc reference to the object
        //new operator used for instantiation(allocates memory in heap)
        //Scanner() matches the constructor from Scanner class to initialise the object
        //System final utility class(java.lang)
        //in public static field Input stream type from System class
       long a=sc.nextInt(16);
        System.out.println(a); //using radix represents base (min=2,max=36) base 2 represnts binary.. 1110 is the input it gives decimal value.. base 16 hexadecimals..
        float b=sc.nextFloat();
        System.out.println(b);
      byte c= sc.nextByte();;
        System.out.println(c);
        long d= sc.nextLong();
        System.out.println(d);
        double e= sc.nextDouble();
        System.out.println(e);
      char ch=sc.next().charAt(0);
        System.out.println(ch);
    }
}
