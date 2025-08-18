package Famouse_Problems;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinAndMaxMedian_Amazon {
    // Your function here
    public static List<Integer> medians(List<Integer> values, int k) {
        List<Integer> ans = new ArrayList<>();
        int n = values.size();
        int total = 1 << n;
        int minMedian = Integer.MAX_VALUE;
        int maxMedian = Integer.MIN_VALUE;

        for(int i = 0; i<total; i++){
            List<Integer> subseq = new ArrayList<>();
            for(int j = 0; j<n;j++ ){
                if((i & (1 << j)) != 0){
                    subseq.add(values.get(j));
                }
            }
            if(subseq.size() == k){
                Collections.sort(subseq);                
                int median = subseq.get((k-1)/2);
                minMedian = Math.min(minMedian, median);
                maxMedian = Math.max(maxMedian, median);

            }
        }
        ans.add(minMedian);
        ans.add(maxMedian);
        return ans;
    }

    

    public static void main(String[] args) {
        // Hardcoded test input
        List<Integer> values = Arrays.asList(1, 2, 3,4);
        int k = 2;

        List<Integer> result = medians(values, k);

        // Print result
        System.out.println(result);
    }
}
