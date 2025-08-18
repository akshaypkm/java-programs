package Array_Problems;

import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        int[][] ans = mergeOverlappingIntervals(arr);
        System.out.print("The merged intervals are: \n");
        for (int[] it : ans) {
            System.out.println("[ "+it[0]+","+it[1]+" ]" );
        }
        System.out.println();
    }

    public static int[][] mergeOverlappingIntervals(int[][] arr) {
        Arrays.sort(arr, Comparator.comparingInt(i -> i[0]));
        List<int[]> result = new ArrayList<>();


        int[] newInterval = arr[0];
        result.add(newInterval);

        for(int[] interval : arr){
            if(interval[0]<=newInterval[1]){
                newInterval[1] = Math.max(newInterval[1], interval[1]);
        System.out.println(newInterval[1]);

            }else{
                newInterval = interval;
                result.add(newInterval);
            }
            
        }
        return result.toArray(new int[result.size()][]);
    }

}
