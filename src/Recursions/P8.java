package Recursions;

import java.util.Scanner;

public class P8 {
    //Multiple recursions calls in one method
    static int fibonacci(int n){
        if(n<=1) return n;
        int index=fibonacci(n-1)+fibonacci(n-2);
        return index;//returns nth fibonacci number.// in fibo series: 0 1 1 2 3 if n=4 at index 4 the number in series is 3
    }                                                                //0 1 2 3 4
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
}
