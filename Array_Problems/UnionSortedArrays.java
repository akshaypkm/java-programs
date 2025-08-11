package Array_Problems;

import java.util.*;

public class UnionSortedArrays {

    public static List<Integer> findUnion(int[] arr1, int[] arr2, int n, int m) {
        Set<Integer> set = new TreeSet<>();
        int maxLength = Math.max(arr1.length, arr2.length);
        for(int i = 0; i<maxLength;i++){
            if(i<arr1.length){
                set.add(arr1[i]);
            }
            if(i<arr2.length){
                set.add(arr2[i]);
            }
        }
        List<Integer> arr = new ArrayList<>(set);
        
        return arr;
    }

    public static void main(String[] args) {

        // Pre-defined sorted arrays
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 20, 3};

        int n = arr1.length;
        int m = arr2.length;

        // Call the union function
        List<Integer> result = findUnion(arr1, arr2, n, m);

        // Output the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}


