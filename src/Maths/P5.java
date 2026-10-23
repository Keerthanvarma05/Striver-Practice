package Maths;

import java.util.Scanner;

public class P5 {
    static String checkArmstrong(int n){
        int sum=0,temp=n,count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        while(temp!=0){
            int digit=n%10;
            sum=sum+(int)Math.pow(digit,count);//n=153 (1*1*1)+(5*5*5)+(3*3*3)
            temp=temp/10;//digit should multiply with itself equal size of number
        }
        if(sum==temp) return "true";
        else return "false";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(checkArmstrong(n));
    }
}
