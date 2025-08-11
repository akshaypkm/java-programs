package Array_Problems;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int n, int []arr, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int[] ans = new int[2];
        for(int i= 0;i<arr.length;i++){
            int num  = arr[i];
            int moreNeed = target - num;

            if(mpp.containsKey(moreNeed)){
                ans[0] = mpp.get(moreNeed);
                ans[1] = i;
                return ans;
            }

            mpp.put(num,i);

            
        }
        return ans;
    }

    public static void main(String args[]) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        int[] finalarr = twoSum(n, arr, target);
        for(int dig : finalarr){
            System.out.println(dig);
        }
    }
}
