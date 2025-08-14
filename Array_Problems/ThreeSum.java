package Array_Problems;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4};
        int n = arr.length;
        Set<List<Integer>> ans = triplet(n, arr);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }

    // brute force - 3 loops

    // private static Set<List<Integer>> triplet(int n, int[] arr){
    //     Set<List<Integer>> ans = new HashSet<>();
    //     int len = arr.length;
    //     for(int i = 0;i<len;i++){
    //         for(int j = i+1;j<len;j++){
    //             for(int k = j+1;k<len;k++){
    //                 if(arr[i]+arr[j]+arr[k] == 0){
    //                     List<Integer> inner = new ArrayList<>();
    //                     inner.add(arr[i]);
    //                     inner.add(arr[j]);
    //                     inner.add(arr[k]);
    //                     inner.sort(null);
    //                     ans.add(inner);
    //                 }
    //             }
    //         }
    //     }

    //     return ans;
    // }

    // optimized - 2 loops

    // private static Set<List<Integer>> triplet(int n, int[] arr){
    //     Set<List<Integer>> ans =  new HashSet<>();
        
    //     int len = arr.length;
    //     for(int i= 0 ;i<len;i++){
    //         Set<Integer> hashset = new HashSet<>();
    //         for(int j = i+1; j<len;j++){
    //             int third = -(arr[i] + arr[j]);
    //             if(hashset.contains(third)){
    //                 List<Integer> temp = Arrays.asList(arr[i],arr[j],third);
    //                 temp.sort(null);
    //                 ans.add(temp);
    //             }
    //             hashset.add(arr[j]);
    //         }
    //     }


    //     return ans; 
    // }

    //optimized - 1 loop

    private static Set<List<Integer>> triplet(int n, int[] arr){


    }


}
