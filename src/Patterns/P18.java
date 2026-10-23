package Patterns;

import java.util.Scanner;

public class P18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(char j=(char)('E'-i);j<='E';j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
