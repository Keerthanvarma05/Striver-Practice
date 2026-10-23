package Patterns;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int a=1;a<=n;a++) {
            for(int b=0;b<a;b++) {
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
