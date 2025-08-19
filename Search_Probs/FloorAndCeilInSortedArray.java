package Search_Probs;


public class FloorAndCeilInSortedArray{

    //The floor of x is the largest element in the array which is smaller than or equal to x.
    // The ceiling of x is the smallest element in the array greater than or equal to x.
    public static void main(String[] args) {

        // Input size
        
        int[] arr = {3,5,8,15,19};
        int N = arr.length;
        int find = 20202020;
        
        int[] result = lowerBound(arr, find, N);

        for(int e : result)
        System.out.print(e+" ");
    }

    private static int[] lowerBound(int[] arr, int find, int N){

        int[] ans = {-1,-1};

        int l = 0;
        int r = N-1;

        while(l<=r){
            int mid = (l+r) / 2;

            if(arr[mid]==find){
                ans[0] = arr[mid];
                ans[1] = arr[mid];

                return ans;
            }else if(arr[mid]>find){
                ans[1] = arr[mid];
                r = mid-1;
            }else{
                ans[0] = arr[mid];
                l = mid+1;
            }
        }


        return ans;
    }
}