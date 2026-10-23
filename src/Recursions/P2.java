package Recursions;

import java.util.Scanner;

public class P2 {
    static void printNum1(int i,int n){
        if(i>n) return;
        System.out.println(i);
        printNum1(i+1,n);
    }
    //using backtracking
    static void printNum2(int i,int n){
        if(i<1) return;
        printNum2(i-1,n);
        System.out.println(i);//after the function call backtracks in the recursion tree it prints
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printNum2(n,n);
    }
}
