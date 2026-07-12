package Basics;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*1.switch case syntax;
        Switch(expression){
        case 1:
            block;
            break;
        default:
        }
         */
        int a=sc.nextInt();
        int b=sc.nextInt();
        char op=sc.next().charAt(0);
     //1.old way
//            switch (op) {
//                case '+':
//                    System.out.println("Sum is: " + (a + b));
//                    break;
//                case '-':
//                    System.out.println("Diiference is: " + (a - b));
//                    break;
//                case '*':
//                    System.out.println("Product of a and b is:" + (a * b));
//                    break;
//                case '/':
//                    if (b != 0) {
//                        System.out.println("Division of a and b is:" + (a / b));
//                    } else {
//                        System.out.println("Infinity");
//                    }
//                    break;
//                case 'X':
//                    System.out.println("End");
//                    break;
//                default:
//                    System.out.println("Invalid operator");
//            }
          //2.enhanced switch case
        switch (op) {
            case '+' -> System.out.println("Sum is: " + (a + b));
            case '-' -> System.out.println("Diiference is: " + (a - b));
            case '*' -> System.out.println("Product of a and b is:" + (a * b));
            case '/' -> {
                if (b != 0) {
                    System.out.println("Division of a and b is:" + (a / b));
                } else {
                    System.out.println("Infinity");
                }
            }
            case 'X' -> System.out.println("End");
            default -> System.out.println("Invalid operator");
        }
        }
    }

