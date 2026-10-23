package Maths;

import java.util.Scanner;
import java.math.*;
public class P1 {
    static int countDigits1(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
    static int countDigits2(int num) {
        int temp=(int)Math.log10(num)+1;//logbase10(7897)rturns 3.8 something so int stores it as 3 so we add+1
        return temp;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(countDigits2(num));
    }
}
