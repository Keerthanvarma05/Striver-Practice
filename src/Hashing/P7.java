package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter elements in array: ");
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if (map.containsKey(ar[i])) {
                map.put(ar[i], map.get(ar[i])+1);
            }
            else {
                map.put(ar[i], 1);
            }
        }
        //To find the max frequency element
        int maxFreq = 0;
        int maxElement = 0;
        int minFreq=Integer.MAX_VALUE,minElement=0;//assigns the max value of integer
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxElement = entry.getKey();
            }
            if(entry.getValue()<minFreq){
                minFreq = entry.getValue();
                minElement = entry.getKey();
            }
        }
        System.out.println("Element with Minimum frequency: "+minElement);
        System.out.println("Minimum Frequency for element: "+minFreq);
        System.out.println("Element with max frequency: " + maxElement);
        System.out.println("Maximum frequency: " + maxFreq);
        //to find min freq element
    }
}
