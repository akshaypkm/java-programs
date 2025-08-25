package Search_Probs;

import java.util.*;


// come back later, not yet solved

public class FindKthPositiveNum{
    public static void main(String[] args) {
        int[] vec = {1,3,4,6,9};
        int n = vec.length, k = 3;
        int ans = missingK(vec, n, k);
        System.out.println("The missing number is: " + ans);
    }
    static boolean flag = true;
    private static int missingK(int[] arr,int n, int k){
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<arr.length; i++){
            if(flag == true){
                looper(arr[i], flag, list);
                flag = false;
            }
            if(i < n-1){
                int fut = arr[i+1];
                int bef = arr[i];

                looper2(fut, bef, list);
            }
        }
        
        
        
        return performBool(list, k, arr);
    }

    private static int performBool(List<Integer> list, int k, int[] arr){
        for(int e : list){
            System.out.print(e+" ");
        }
        System.out.println();

        if(list.size()>0 && list.size() < k){
            int last = list.get(list.size()-1);
            System.out.println(last);
            while(list.size() != k){
                list.add(last+1);
                last++;
                
            }
        }else{
            int last = arr[arr.length-1];
            System.out.println(last);
            while(list.size() != k){
                list.add(last+1);
                last++;
        }
    }

        for(int e : list){
            System.out.print(e+" ");
        }
        System.out.println();
        int l = 0; 
        int r = list.size() - 1;
        System.out.println(list.get(list.size()-1));

        while(l<=r){
            int mid = (l+r)/2;
            if(mid+1 == k){
                return list.get(mid);
            }else if( mid > k){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return -1;
    }
   
    private static void looper2(int fut, int bef, List<Integer> list){
        for(int i = bef+1; i<fut; i++){
            list.add(i);
        }
    }
    private static void looper(int i, boolean flag, List<Integer> list){
        
        if(flag == true){
            for(int j = 1;j<i;j++){
                list.add(j);
            }
        }
    }
}