package Recursions;

import java.util.Scanner;

public class P5 {
    //functional recursion
    static int factorial1(int n){ //if n=3 1*2*3=6
        if(n==1) return 1;
        else return n*factorial1(n-1);
    }
    //parameterized recursion
    static void factor(int n,int fact){//1*2*3
        if(n<1){
            System.out.println(fact);
            return;
        }
        factor(n-1,fact*n);// 3-1=2 && 1*3=3 / 2-1=1 && 3*2=6 / 1-1=0 && 6*1=6/ n<1
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //System.out.println(factorial1(n));
        factor(n,1);
    }
}
