package Array_Problems;

import java.util.*;

public class ArrayElementNby3times {
    public static void main(String args[]) {
        int[] arr = {11, 33, 33, 11, 33, 11};
        Set<Integer> ans = majorityElement(arr);
        System.out.print("The majority elements are: ");
        for (int i : ans) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static Set<Integer> majorityElement(int[] arr){
        Set<Integer> ans = new HashSet<>();
        int nBy3 = arr.length / 3;
        Map<Integer, Integer> map = new HashMap<>();

        for(int ele : arr){

            int val = map.getOrDefault(ele,0);
            map.put(ele, val+1);
            
            if(map.get(ele) > nBy3){
                ans.add(ele);
            }
            if(ans.size() == 2)break;
        }
        return ans;
    }
    
}
