package Patterns;

import java.util.Scanner;

public class P19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //up
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i;j++){  //remember no spaces in first line so we start from 2nd line j=1
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){//remember no spaces in first line so we start from 2nd line j=1
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //down
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<n-i;j++){//remember no spaces in first line so we start from 2nd line j=1
                System.out.print(" ");
            }
            for(int j=1;j<n-i;j++){//remember no spaces in first line so we start from 2nd line j=1
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
