package Recursions;

import java.util.Scanner;

public class P3 {
    static void printrev(int i,int n){
        if(i<1) return;
        System.out.println(i);
        printrev(i-1,n);
    }
    //using back tracking
    static void printrev1(int i,int n){
        if(i>n) return;
        printrev1(i+1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printrev1(1,n);
    }
}
