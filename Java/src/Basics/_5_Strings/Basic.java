package Basics._5_Strings;

//import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
                //syntax: String refVariable=Object;
        String a="Hello";
        String b="Hello";
        //to check both the reference variables or pointing to the same objects!!
        System.out.println(a==b);
        String c=a;
        System.out.println(a==c);
        System.out.println(b==c);
        System.out.println(c==b);

        //beacuse java creates string pool inside heap memeory..where the similiar String object sstores once..
        System.out.println("After:");
        a="Kunal";
        System.out.println(a==b);//false
        System.out.println(a==c);//false
        System.out.println(b==c);//true
        System.out.println(c==b);//true
        b=new String("Hello");
        //false beacuse now b points to the new objects called "Hello"(even both the strings are equals).
        System.out.println("Refrencing same?:");
        System.out.println(b==c);
        System.out.println("Value check:");
        System.out.println(b.equals(c));
        String arr[]={"Hello","Hi"};
        System.out.println(arr[0]+" "+arr[1]);
//        arr[0]="Hi";
        arr[1]= new String("Hello");
        System.out.println(arr[0]+" "+arr[1]);
        System.out.println(arr[1].intern()==arr[0]);
      StringBuffer sb=new StringBuffer();


    }
}
