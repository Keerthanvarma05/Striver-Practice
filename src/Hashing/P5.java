package Hashing;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        System.out.println("Enter no.of Search element: ");
        int q=sc.nextInt();
        int hash[]=new int[256];
        for(int i=0;i<str.length();i++) {//total no.of chars exists
            hash[str.charAt(i)]++;//str=varma i=0 =v hash[v]++
        }
        while(q-->0){
            System.out.println("Enter Search element: ");
            char ch=sc.next().charAt(0);
            System.out.println("Frequency of character: "+hash[ch]);
        }
    }
}
