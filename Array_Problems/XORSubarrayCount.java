package Array_Problems;

import java.util.*;

class XORSubarrayCount{
    public static void main(String[] args) {
        int[] a = {4, 2, 2, 6, 4};
        int k = 6;
        int ans = subarraysWithXorK(a, k);
        System.out.println("The number of subarrays with XOR k is: " + ans);
    }

    private static int subarraysWithXorK(int[] arr, int k){

        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
        int xor = 0;

             for( int j = i; j<arr.length; j++){
                xor = xor ^ arr[j];

                if(xor == k){
                    count++;
                }
             }   
            }
        return count;

    }   
}