package Hashing;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0;i<size;i++){
            ar[i]=sc.nextInt();
        }
        int hash[]=new int[100];
        for(int i=0;i<size;i++){
            hash[ar[i]]=hash[ar[i]]+1;//hash=(hash[1])0+1=1
        }
        System.out.println("Enter no.of search elements: ");
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            System.out.println("Enter search element: ");
            int num=sc.nextInt();
            System.out.println("Frequency of number in arr: "+hash[num]);
        }
    }
}
