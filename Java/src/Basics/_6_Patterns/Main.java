package Basics._6_Patterns;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        // int n=sc.nextInt();
        int patternNo = sc.nextInt();
        switch (patternNo) {
            case 1:
                pattern1(m);
                break;
            case 2:
                pattern2(m);
                break;
            case 3:
                pattern3(m);
                break;
            case 4:
                pattern4(m);
                break;
            case 5:
                pattern5(m);
                break;
            case 6:
                pattern6(m);
                break;
            case 7:
                pattern7(m);
                break;
            case 8:
                pattern8(m);
                break;
            case 9:
                pattern9(m);
                break;
            case 10:
                pattern10(m);
                break;
            case 11:
                pattern11(m);
                break;
            case 12:
                pattern12(m);
                break;
            case 13:
                pattern13(m);
                break;
            case 14:
                pattern14(m);
                break;
            case 15:
                pattern15(m);
                break;
            case 16:
                pattern16(m);
                break;
            case 17:
                pattern17(m);
                break;
            case 18:
                pattern18(m);
                break;
            case 19:
                pattern19(m);
                break;
            case 20:
                pattern20(m);
                break;
            case 21:
                pattern21(m);
                break;
            case 22:
                pattern22(m);
                break;
            case 23:
                pattern23(m);
                break;
            case 24:
                pattern24(m);
                break;
            case 25:
                pattern25(m);
                break;
            case 26:
                pattern26(m);
                break;
            case 27:
                pattern27(m);
                break;
            case 28:
                pattern28(m);
                break;
            case 29:
                pattern29(m);
                break;
            case 30:
                pattern30(m);
                break;
            case 31:
                pattern31(m);
                break;
            case 32:
                pattern32(m);
                break;
            case 33:
                pattern33(m);
                break;
            case 34:
                pattern34(m);
                break;
            case 35:
                pattern35(m);
                break;
            default:
                System.out.println("Invalid Pattern Number");
                break;
        }
    }

    public static void pattern1(int m) {
        for (int row = 1; row <= m; row++) {
            for (int col = 1; col <= m; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int m) {
        for (int row = 1; row <= m; row++) {
            for (int col = 1; col <= m; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int m) {
        for (int row = 1; row <= m; row++) {
            for (int col = 1; col <= m - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int m) {
        for (int row = 1; row <= m; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    //    public static void pattern5(int m,int n){
//        for(int row=1;row<=m;row++){
//            for(int col=1;col<=row;col++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int row=1;row<m;row++){
//            for(int col=1;col<m-row+1;col++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
    public static void pattern5(int m) {
        for (int row = 1; row <= 2 * m - 1; row++) {
            int totalColumninRow = 0;
            if (row <= m) {
                totalColumninRow = row;
            } else {
                totalColumninRow = 2 * m - row;

            }
            for (int col = 1; col <= totalColumninRow; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern6(int m) {
        for (int row = 1; row <= m; row++) {
            for (int space = 1; space <= m - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern7(int m) {
        for (int row = 1; row <= m; row++) {
            for (int space = 1; space <= row - 1; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= m - row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern8(int m) {
        for (int row = 1; row <= m; row++) {
            for (int space = 1; space <= m - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }
//            for(int col=1;col<row;col++){
//                System.out.print("*");
//            }
            System.out.println();
        }
    }

    public static void pattern9(int m) {
        for (int row = 1; row <= m; row++) {
            for (int space = 1; space <= row - 1; space++) {
                System.out.print(" ");
            }
            int totalColinRows = 2 * (m - row) + 1;
            for (int col = 1; col <= totalColinRows; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern10(int m) {
        for (int row = 1; row <= m; row++) {
            for (int space = 1; space <= m - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern11(int m) {
        for (int row = 1; row <= m; row++) {
            for (int space = 1; space <= row - 1; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= m - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern12(int m) {
        for (int row = 1; row <= 2 * m; row++) {
            int totalColinRow = 0;
            int totalSpaceinRow = 0;
            if (row <= m) {
                totalColinRow = m - row + 1;
                totalSpaceinRow = row - 1;
            } else {
                totalColinRow = row - m;
                totalSpaceinRow = 2 * m - row;
            }
            for (int space = 1; space <= totalSpaceinRow; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColinRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern13(int m) {
        for (int row = 1; row <= m; row++) {
            for (int col = 1; col <= 2 * m - 1; col++) {
                if (col == m - row + 1 || col == m + row - 1 || row == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern14(int m) {
        for (int row = 1; row <= m; row++) {
            for (int col = 1; col <= 2 * m - 1; col++) {
                if (row == 1 || col == row || col == 2 * m - row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern15(int m) {
        for (int row = 1; row <= 2*m-1; row++) {

            int totalColinRows = 2 * m - 1;
            for (int col = 1; col <= totalColinRows; col++) {
                if (row <= m) {
                    if (col == m - row + 1 || col == m + row - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (col == row - m+1 || col == (2 * m - (row - m))-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    public static void pattern16(int m){
        for(int row=1;row<=m;row++){
            for(int space=1;space<=m-row;space++){
                System.out.print("  ");
            }
            int value=1;
            for(int col=1;col<=row;col++){
                System.out.printf("%-4d",value);
                value=value*(row-col)/col;
            }
            System.out.println();
        }
    }
    public static void pattern17(int m){
        for(int row=1;row<=m;row++){
            for(int col=1;col<=m;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern18(int m){
        for(int row=1;row<=m;row++){
            for(int col=1;col<=m;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern19(int m){
        for(int row=1;row<=m;row++){
            for(int col=1;col<=m;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern20(int m){
        for(int row=1;row<=m;row++){
            for(int col=1;col<=m;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }public static void pattern21(int m){
        for(int row=1;row<=m;row++){
            for(int col=1;col<=m;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }public static void pattern22(int m){
        for(int row=1;row<=m;row++){
            for(int col=1;col<=m;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }public static void pattern23(int m){
        for(int row=1;row<=m;row++){
            for(int col=1;col<=m;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }public static void pattern24(int m){
        for(int row=1;row<=m;row++){
            for(int col=1;col<=m;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }public static void pattern25(int m){
        for(int row=1;row<=m;row++){
            for(int col=1;col<=m;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }public static void pattern26(int m){
        for(int row=1;row<=m;row++){
            for(int col=1;col<=m;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }public static void pattern27(int m){
        for(int row=1;row<=m;row++){
            for(int col=1;col<=m;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }public static void pattern28(int m){
        for(int row=1;row<=m;row++){
            for(int col=1;col<=m;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }public static void pattern29(int m){
        for(int row=1;row<=m;row++){
            for(int col=1;col<=m;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }public static void pattern30(int m){
        for(int row=1;row<=m;row++){
            for(int col=1;col<=m;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }public static void pattern31(int m){
        for(int row=1;row<=m;row++){
            for(int col=1;col<=m;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }public static void pattern32(int m){
        for(int row=1;row<=m;row++){
            for(int col=1;col<=m;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }public static void pattern33(int m){
        for(int row=1;row<=m;row++){
            for(int col=1;col<=m;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }public static void pattern34(int m){
        for(int row=1;row<=m;row++){
            for(int col=1;col<=m;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }public static void pattern35(int m){
        for(int row=1;row<=m;row++){
            for(int col=1;col<=m;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//    *
//   * *
//  *   *
// *     *
//*********
