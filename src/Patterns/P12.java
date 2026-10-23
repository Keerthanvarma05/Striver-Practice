package Patterns;

import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <=i; j++){
                System.out.print(j);
            }
            int spaces=(2*N)-(2*i);
            for(int j = 1; j <=spaces  ; j++){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
