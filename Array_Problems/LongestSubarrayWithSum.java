package Array_Problems;


//NOT SOLVED YET!!

public class LongestSubarrayWithSum {
     public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }

    private static int getLongestSubarray(int[] a, long k){
        long tSum = a[0];

        int left = 0;
        int right = 0;
        int maxLen = 0;
        while(right<a.length){
            while(tSum<=k){

            }
        }
        return -1;
    }
}
