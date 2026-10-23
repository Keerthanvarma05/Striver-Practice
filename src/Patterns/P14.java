package Patterns;

import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(char j='A';j<'A'+i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
