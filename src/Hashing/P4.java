package Hashing;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        int hash[]=new int[26];
        for(int i=0;i<str.length();i++){
            hash[str.charAt(i)-'a']+=1;// varma is string v-a(v=118(ascii)-a=97= 118-97=21 at 21position of ar value+1
        }
        System.out.println("Enter no.of search elements: ");
        int q=sc.nextInt();
        while(q-->0){
            System.out.println("Enter search element: ");
            char ch=sc.next().charAt(0);
            System.out.println("frequency of character in string: "+hash[ch-'a']);
        }
    }
}
