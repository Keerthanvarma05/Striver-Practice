package Recursions;

import java.util.Scanner;

public class P4 {
    //parameterized recursion
    static void sumf(int i,int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        sumf(i - 1, sum + i);// 3-1=2 && 0+3=3 / 2-1=1 && 3+2=5 / 1-1=0 && 5+1=0/ i<1
    }
    //functional recursion
    static int funcsum(int n){
        if(n==0) return 0;
        return n+funcsum(n-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        //sumf(n,0);
        System.out.println(funcsum(n));
    }
}
