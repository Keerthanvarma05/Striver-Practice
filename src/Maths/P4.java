package Maths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P4 {
    static void printDivisors1(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    static void printDivisors2(int num) {
        ArrayList<Integer> l1=new ArrayList<>();
        for (int i = 1; i*i <= num; i++) {
            if (num % i == 0) {
                l1.add(i);
            }
            if(num/i!=i){
                l1.add(num/i);
            }
            Collections.sort(l1);
            System.out.println(l1);
        }
        System.out.println("Final List: "+l1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        printDivisors2(num);
    }
}
