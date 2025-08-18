package Array_Problems;

public class LongestSubarrayWithSum {
     public static void main(String[] args) {
        int[] a = {1,2,3,1,1,1,1};
        int k = 5;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }

    //brute force

    // private static int getLongestSubarray(int[] a, int k){
        
    //     int fcount = 0;

    //     for(int i = 0; i<a.length;i++){
    //         if(a[i] == k) return Math.max(fcount, 1);
    //         int sum = a[i];
    //         int count = 1;
    //         for(int j = i+1; j<a.length; j++){
    //             sum = sum + a[j];
    //             count++;
    //             if(sum == k){
    //                 fcount = Math.max(count,fcount );
    //             }
    //         }
    //     }
    //     return fcount;
    // }


//===========================================================
    // works for positive and negative elemented arrays
//===========================================================
    // private static int getLongestSubarray(int[] a, int k){
        
    //     int fcount = 0;
    //     Map<Integer, Integer> map = new HashMap<>();
    //     int sum = 0;
    //     for(int i = 0; i<a.length;i++){
    //         if(a[i] == k) fcount = Math.max(fcount, 1);
    //         sum += a[i];
    //         if(sum == k){
    //             fcount = Math.max(fcount, i+1);
    //         }
    //         if(map.containsKey(sum - k)){

    //             fcount = Math.max(fcount, i - map.get(sum-k));
    //         }else{
    //             if(!map.containsKey(sum)){
    //             map.put(sum, i);
    //             }
    //         }
    //     }
    // return fcount;
    // }

//===========================================================
    //works for only positive elemented arrays
//===========================================================
    private static int getLongestSubarray(int[] a, int k){
        int sum = a[0];
        int len = 0;
        int left = 0;
        int right = 0;
        int n = a.length;

        while(right<n){
            while(left<=right && sum>k){
                sum = sum - a[left];
                left++;
            }

            if(sum == k){
                len = Math.max(len, right - left +1);
            }

            right++;
            if(right<n)
            sum = sum + a[right];
        }

        
        return len;
    }
}
