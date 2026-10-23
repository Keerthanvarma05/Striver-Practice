package Maths;

import java.util.Scanner;

public class P2 {
    static int revNum(int num) {
        int rev=0;
        while (num!=0) {
            rev=(rev*10)+(num%10);
            num/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(revNum(num));
    }
}
