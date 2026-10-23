package Recursions;

import java.util.Scanner;

public class P7 {
    static boolean palindrome(String s,int i){
        if(i>s.length()/2) return true;
        if(s.charAt(i)!=s.charAt(s.length()-1)) return false;
        palindrome(s,i+1);
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();
        System.out.println(palindrome(s,0));
    }
}
