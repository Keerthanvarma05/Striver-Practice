package Recursions;

import java.util.Scanner;

public class P1 {
    static void print(int i,int n){
        if(i>n) return;
        System.out.println("Keerthan Varma");
        print(i+1,n);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(1,n);
    }
}
