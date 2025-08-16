package Array_Problems;

import java.util.*;

public class LongestSubarrayTotalsZero {
    public static void main(String args[]) 
    { 
        int a[] = {9, -3, 3, -1, 6, -5};
        System.out.println(solve(a));
    } 

    private static int solve(int[] a){
        int max = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<a.length;i++){
            sum = sum + a[i];
            
            if(sum == 0){
                max = Math.max(max, i +1);
            }
            if(map.get(sum)!=null){
                max = Math.max(max, (i - (map.get(sum))));
            }else{
                map.put(sum, i);
            }
   
        }

        return max;
    }
}
