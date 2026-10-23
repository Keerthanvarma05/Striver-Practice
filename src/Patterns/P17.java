package Patterns;

import java.util.Scanner;

public class P17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //spaces
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            //chars
            char ch='A';
            int breakp=(2*i)/2;
            for(int j=1;j<2*i;j++){
                System.out.print(ch);
                if(j<breakp) ch++;
                else ch--;
            }
            //spaces
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
