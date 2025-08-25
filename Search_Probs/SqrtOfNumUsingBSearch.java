package Search_Probs;

public class SqrtOfNumUsingBSearch {
    public static void main(String[] args) {
        int n = 64;
        int ans = floorSqrt(n);
        System.out.println("The floor of square root of " + n + " is: " + ans);
    }

    private static int floorSqrt(int n){
        int l = 0; 
        int r = n;
        while(l<=r){
            int mid = (l+r) / 2;

            if(mid * mid == n){
                return mid;
            }else if(mid * mid >= (long) n){
                r = (int)mid-1;
            }else{
                l = (int)mid+1;
            }

        }

        return r;
    }
}
