package Search_Probs;

public class NthRootOfaNumUsingBSearch {
    public static void main(String[] args) {
        int n = 3, m = -27;
        int ans = NthRoot(n, m);
        System.out.println("The answer is: " + ans);
    }

    private static int NthRoot(int n, int m){
        int l = 1; 
        int r = m;
        while(l<=r){
            int mid = (l+r) / 2;
            int val = 1;
            for(int i = 0; i<n; i++){
                val = val * mid;
                if(val > m) break;
            }
            if(val == m){
                return mid;
            }else if(val < m){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
    return -1;
    }

    // tuf logic
    
    // private static int NthRoot(int n, int m){
    //     int l = 1; 
    //     int r = m;
    //     while(l<=r){
    //         int mid = (l+r) / 2;
    //         int val = func(mid, n, m);
    //         if(val == 1){
    //             return mid;
    //         }else if(val == 0){
    //             l = mid+1;
    //         }else{
    //             r = mid-1;
    //         }
    //     }
    // return -1;

    // }
    

    // private static int func(int mid, int n, int m){
    //     long val = 1;

    //     for(int i = 0; i<n; i++){
    //             val = val * mid;
    //             if(val > m) return 2;
    //         }
    //         if(val == m) return 1;
    //         return 0;
    // }
}
