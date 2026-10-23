package Patterns;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int a=0;a<n;a++) {
            for(int b=1;b<=n-a;b++) {
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
