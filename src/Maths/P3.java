package Maths;

import java.util.Scanner;

public class P3 {
    static String checkPalindrome(int num) {
        int temp = num;
        int rev=0;
        while (num != 0) {
            rev=(rev*10)+(num%10);
            num=num/10;
        }
        if(temp==rev) return "true";
        else return "false";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(checkPalindrome(num));
    }
}
