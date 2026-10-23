package Maths;

import java.util.Scanner;

public class P6 {
    static String checkPrime1(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2) return "true";
        else return "false";
    }
    static String checkPrime2(int n){
        int count=0;
        for(int i=2;i*i<=n;i++){//same divisors concept
            if(n%i==0){
                count++;
            }
        }
        if(count==0) return "true";
        else return "false";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        System.out.println(checkPrime2(n));
    }
}
