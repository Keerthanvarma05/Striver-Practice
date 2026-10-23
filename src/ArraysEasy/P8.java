package ArraysEasy;
import java.util.*;

public class P8 {
    //Using set
    static List<Integer> unionOfArrays1(int[] arr1,int[] arr2){
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        return new ArrayList<>(set);
    }
    //optimal but duplicates may exist
    static List<Integer> unionOfArrays2(int[] arr1, int[] arr2){
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length) {
            if (list.isEmpty() || list.get(list.size() - 1) < arr1[i]) {
                list.add(arr1[i]);
                i++;
            } else if (list.isEmpty() || list.get(list.size() - 1) == arr2[i]) {
                list.add(arr2[i]);
                j++;
            } else {
                // Elements are equal, add once if not duplicate
                if (list.isEmpty() || list.get(list.size() - 1) != arr1[i])
                    list.add(arr1[i]);
                i++;
                j++;  // Move both pointers
            }
        }
        // Append remaining elements from arr1
        while (i < arr1.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != arr1[i])
                list.add(arr1[i]);
            i++;
        }

        // Append remaining elements from arr2
        while (j < arr2.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != arr2[j])
                list.add(arr2[j]);
            j++;
        }

        // Return the union list
        return list;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array1: ");
        int n=sc.nextInt();
        int ar1[]=new int[n];
        System.out.println("Enter the elements of the array1: ");
        for(int i=0;i<n;i++){
            ar1[i]=sc.nextInt();
        }
        System.out.println("Enter the size of the array2: ");
        int m=sc.nextInt();
        int ar2[]=new int[m];
        System.out.println("Enter the elements of the array2: ");
        for(int i=0;i<m;i++){
            ar2[i]=sc.nextInt();
        }
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        List<Integer> result = unionOfArrays2(ar1, ar2);
        for(int num:result){
            System.out.print(num+" ");
        }
    }
}
