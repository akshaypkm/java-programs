package Search_Probs;

public class CountOccurencesInSortedArray {
    public static void main(String[] args) {
        int[] arr =  {8};
        int n = arr.length, x = 8;
        int first = count(arr, n, x, true);
        int second = count(arr, n, x, false);
        int ans = second - first +1;
        System.out.println("The number of occurrences is: " + ans);
    }

    private static int count(int[] arr, int n, int x, boolean isfirst){
        int l = 0;
        int r = n-1;
        int idx = 0;

        while(l<=r){
            int mid = (l+r) / 2;

            if(arr[mid] == x){
                if(isfirst){ 
                    idx = mid;
                    r = mid-1;
                }else{
                    idx = mid;
                    l = mid+1;
                }
            }else if(arr[mid] > x){
                r = mid - 1;
            }else if(arr[mid]<x){
                l = mid + 1;
            }
        }
        return idx;
    }
}
