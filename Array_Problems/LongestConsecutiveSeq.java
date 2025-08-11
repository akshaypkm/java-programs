package Array_Problems;

import java.util.*;

public class LongestConsecutiveSeq {
    
    public static void main(String args[]) {
            int[] arr = {5,1113,33,79,6,32};
            System.out.println(answer(arr));

        }
    
    // private static int answer(int[] arr){
    //     int longest = 0;
    //     int currlong = 0;
    //     Arrays.sort(arr);
    //     for(int i = 0; i<arr.length-1;i++){
    //         if((arr[i+1] - arr[i]) == 1  ){
    //             currlong ++;
    //         }else if((arr[i+1] - arr[i]) == 0){
    //             continue;
    //         }else{
    //             longest = Math.max(longest, currlong);
    //             currlong = 0;
    //         }
    //     }
    //     return longest+1;
    // }

    //using hashset

    private static int answer(int[] arr){
        int longest = 1;
        int count = 0;
        Set<Integer> hash = new HashSet<>();

        for(int i = 0; i<arr.length;i++){
            hash.add(arr[i]);
        }
        System.out.println(hash);
        for (int it : hash) {
            // if 'it' is a starting number
            if (!hash.contains(it - 1)) {
                System.out.println("im in" + it);
                // find consecutive numbers
                int cnt = 1;
                int x = it;
                while (hash.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
            System.out.println(longest);
        }

        return longest;
    }
}
