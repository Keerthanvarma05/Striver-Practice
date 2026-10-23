package Patterns;

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            //spaces
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<=2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
