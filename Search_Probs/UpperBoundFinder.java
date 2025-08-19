package Search_Probs;

import java.util.Scanner;

    public class UpperBoundFinder {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input size
            
            int[] arr = {3,5,8,9,15,19};
            int N = arr.length;
            int x = sc.nextInt();

            // Call the function
            int result = upperBound(arr, x, N);

            // Output result
            System.out.println(result);
        }

    public static int upperBound(int[] arr, int x, int N) {
        int ans = N;

        int right = N-1;
        int left = 0;

        while(left<=right){
            int mid = (left+right) / 2;
            System.out.println(mid);

            if(arr[mid]>x){
                ans = mid;
                right = mid -1;
            }else{
                left = mid +1;
            }
        
        }
        return ans;
    }
}
