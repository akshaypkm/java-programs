package Array_Problems;


public class RearrangeArrayEleBySign {
    
    public static void main(String args[]) 
    {
    // Array Initialisation.
    int A[]= {-1,-2,-3,1,2,3};
    int n = A.length;


    int[]ans= RearrangebySign(A,n);
    
    for (int i = 0; i < n; i++) {
        System.out.print(ans[i]+" ");
    }
    }
    private static int[] RearrangebySign(int[] arr, int n){
        int[] ans = new int[n];
        int plus = 0, minus = 0;

        
        for(int i = 0;i<n;i=i+2){
            while(plus < n&&arr[plus]<0){
                plus++;
            }
            if(plus<n){
            ans[i] = arr[plus];
            }
            while(minus<n&&arr[minus]>0 ){
                minus++;
            }
            if(minus<n){
            ans[i+1] = arr[minus];
            }
        

            plus++;
            minus++;
            for (int j = 0; j < n; j++) {
        System.out.print(ans[j]+" ");

    }
    System.out.println();
        }
        return ans;
    }
}
