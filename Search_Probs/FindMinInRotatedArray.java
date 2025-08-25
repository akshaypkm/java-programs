package Search_Probs;

class Solution {
    public int findMin(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        int min = Integer.MAX_VALUE;
        while(l<=r){
            int mid = (l+r)/2;

            if(arr[l] <= arr[mid]){
                min = Math.min(arr[l],min);
                l = mid+1;
            }else{
                min = Math.min(min, arr[mid]);
                r = mid-1;
            }
    }
    return min;
}
}