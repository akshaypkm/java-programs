package Search_Probs;

import java.util.*;


public class LowerBoundFinder {

    public static int lowerBound(int[] arr, int x, int N) {
        int l = 0;
        int r = N-1;
        int ans = N;

        while(l<=r){
            int mid = (l+r) / 2;
            if(arr[mid] >= x){
                ans = mid;
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return ans; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        
        int[] arr = {3,5,8,15,19};
        int N = arr.length;
        int x = sc.nextInt();

        // Call the function
        int result = lowerBound(arr, x, N);

        // Output result
        System.out.println(result);
    }
}


