package Basics._3_functions;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPalindrome(n)) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
    public static boolean isPalindrome(int n){
        int num=n;
        int rev=0;
        while(num>0){
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        if(rev==n){
            return true;
        }
        return false;
    }
}
