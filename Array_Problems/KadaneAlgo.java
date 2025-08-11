package Array_Problems;
import java.util.*;

// Kadane's Algorithm : Maximum Subarray Sum in an Array

// Problem Statement: Given an integer array arr, find the contiguous subarray (containing at least one number) which
// has the largest sum and returns its sum and prints the subarray.


public class KadaneAlgo {
    public static void main(String args[]) {
        int[] arr = {1000*1000};
        int n = arr.length;
        long maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);

    }

    private static int maxSubarraySum(int[] arr, int n){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int end = 0;

        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i<arr.length;i++){
            sum = sum + arr[i];
            if(sum<0){
                sum = 0;
                start = i+1;
            }
            if(max<sum){
                end = i;
                max = sum; 
            }
        }
        for(int j = start;j<=end;j++){
            ans.add(arr[j]);
        }

        if(max<=0){
            return -1;
        }
        System.out.println(ans);
        System.out.println(sum);
        System.out.println(max);



        System.out.println("Start: "+ start + " End: "+end);
        return max;
    } 
}
