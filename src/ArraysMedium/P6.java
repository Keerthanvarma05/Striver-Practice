package ArraysMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P6 {
    //Brute for equal pos and neg elements in array
    public static void rearrangeBySigns1(int arr[]){
        int n=arr.length;
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]<0) {
                pos.add(arr[i]);
            } else neg.add(arr[i]);
        }
        for(int i=0;i<n/2;i++){
            arr[i*2]=pos.get(i);
            arr[i*2+1]=neg.get(i);
        }
    }
    //Optimal for equal pos and neg elements in array
    public static int[] rearrangeBySigns2(int arr[]){
        int n=arr.length;
        int pos=0,neg=1;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ans[pos]=arr[i];
                pos+=2;
            } else {
                ans[neg] = arr[i];
                neg+=2;
            }
        }
        return ans;
    }
    //Optimal for non equal neg and pos elements
    public static void rearrangeBySigns3(int arr[]){
        int n=arr.length;
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                pos.add(arr[i]);
            }
            else neg.add(arr[i]);
        }
        if(pos.size()>neg.size()){
            for(int i=0;i<neg.size();i++){
                arr[i*2]=pos.get(i);
                arr[i*2+1]=neg.get(i);
            }
            int index=neg.size()*2;
            for(int i=neg.size();i< pos.size();i++){
                arr[index]=pos.get(i);
                index++;
            }
        }
        else {
            for(int i=0;i<pos.size();i++){
                arr[i*2]=pos.get(i);
                arr[i*2+1]=neg.get(i);
            }
            int index=pos.size()*2;
            for(int i=pos.size();i< neg.size();i++){
                arr[index]=neg.get(i);
                index++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[]={2, 4, 5, -1, -3, -4};
        //Rearrange array elements by sign
        //rearrangeBySigns2(arr);
        int resar[]=rearrangeBySigns2(arr1);
        System.out.println("Sorted array: ");
        for(int i = 0; i <resar.length; i++){
            System.out.print(resar[i]+" ");
        }
        System.out.println();
        int arr2[]={1,-2,-2,-4,3,-5};
        rearrangeBySigns3(arr2);
        System.out.println("Sorted array: ");
        for(int i = 0; i <arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
