package Patterns;

import java.util.Scanner;

public class P15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(char j='A';j<='A'+((n-1)-i);j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
