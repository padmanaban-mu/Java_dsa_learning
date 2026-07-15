package Basics._4_Arrays;

//import java.util.ArrayList;
//import java.util.Scanner;
import java.util.*;
public class TwoDArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<List<Integer>> ans=new ArrayList<>();
     list.add(10);
     list.add(10);
     list.add(10);
     list.add(10);
     list.add(10);
     list.add(10);
     ans.add(list);
        System.out.println(ans);
    }
}
