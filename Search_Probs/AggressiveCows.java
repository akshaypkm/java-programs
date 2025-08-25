package Search_Probs;

import java.util.*;
public class AggressiveCows {
    public static void main(String[] args) {
        int[] stalls = {4,2,1,3,6};
        int k = 2   ;
        int ans = aggressiveCows(stalls, k);
        System.out.println("The maximum possible minimum distance is: " + ans);
    }

    private static int aggressiveCows(int[] stalls, int k){
        Arrays.sort(stalls);
        int n = stalls.length;
        if(k == 2){
            return stalls[stalls.length-1] - stalls[0];
        }
        int l = 1; 
        int r = stalls[n-1];
        while(l<=r){
            int mid = (l+r) / 2;
            if(canWePlace(stalls, k, mid) == true){
                l = mid+1;
            }else{
                r = mid - 1;
            }
        }
        return r;
    }

    private static boolean canWePlace(int[] stalls, int k, int dist){
        int count = k-1;
        int last = stalls[0];
        for(int i = 1;i <stalls.length; i++){
            if(stalls[i] - last >= dist){
                count--;
                last = stalls[i];
            }
            if(count == 0){
            return true;
        }
        }
        
        return false;
    }
}
