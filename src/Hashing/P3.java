package Hashing;

import java.util.Scanner;

public class P3 {
    static int search(char c,String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        System.out.println("Enter Search element: ");
        char c=sc.next().charAt(0);
        System.out.println("Frequency of character: "+search(c,str));
    }
}
