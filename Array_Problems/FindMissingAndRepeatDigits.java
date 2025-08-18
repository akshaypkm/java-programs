package Array_Problems;

import java.util.*;

public class FindMissingAndRepeatDigits{
    public static void main(String[] args) {
        int[] a = {3, 1, 2, 5, 4, 6, 7, 5};
        int[] ans = findMissingRepeatingNumbers(a);
        System.out.println("The repeating and missing numbers are: {"
                           + ans[0] + ", " + ans[1] + "}");
    }

    // private static int[] findMissingRepeatingNumbers(int[] a){
    //     int[] ans = new int[2];
    //     int n = a.length;
    //     int sum = n*(n+1) / 2;
    //     Map<Integer, Integer> map = new HashMap<>();
    //     int sum2 = 0;
    //     for(int e: a){
    //         int val = map.getOrDefault(e, 0);

    //         map.put(e,++val);

    //         sum2 += e;
    //     }
    //     for(int k : map.keySet()){
    //         if(map.get(k) == 2){
    //             ans[0] = k;
    //             ans[1] = sum - (sum2 - k);
    //         }
    //     }

    //     return ans;
    // }

    private static int[] findMissingRepeatingNumbers(int[] a){
        int n = a.length;
        int[] ans = new int[2];
        int[] freq = new int[n+1];

        for(int e : a){
            freq[e] ++;
        }
        for(int i = 1; i<=n; i++){
            if(freq[i] == 2) ans[0] = i;
            if(freq[i] == 0) ans[1] = i;
        }
        return ans;
    }
}