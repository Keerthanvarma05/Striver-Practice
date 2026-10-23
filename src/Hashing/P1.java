package Hashing;

import java.util.Scanner;

public class P1 {
    static int search(int ar[],int element){
        int count=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]==element){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter Search element: ");
        int element=sc.nextInt();
        System.out.println("Count of element: "+search(ar,element));
    }
}
