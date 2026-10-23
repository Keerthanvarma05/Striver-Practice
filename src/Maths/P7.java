package Maths;

import java.util.Scanner;

public class P7 {
    static int gcd1(int a,int b){
        int gcd=1;
        for(int i=1;i<=Math.min(a,b);i++){
            if(a%i==0&&b%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
    static int gcd2(int a,int b){
        for(int i=(int)Math.min(a,b);i>=1;i--){
            if(a%i==0&&b%i==0){
                return i;
            }
        }
        return 0;
    }
    static int gcd3(int a,int b){//euclidean method
        while(a>0&&b>0){
            if(a>b) a=a%b;
            else b=b%a;
        }
        if (a==0) return b;
        else return a;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println(gcd3(a,b));
    }
}
