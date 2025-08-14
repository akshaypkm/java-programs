package Array_Problems;

import java.util.*;

public class FourSum{
    public static void main(String[] args) {
            int[] arr = {4,3,3,4,4,2,1,2,1,1};
            int n = 9;
            List<List<Integer>> ans = quad(n, arr);
            for (List<Integer> it : ans) {
                System.out.print("[");
                for (Integer i : it) {
                    System.out.print(i + " ");
                }
                System.out.print("] ");
            }
            System.out.println();
        }
    

    private static List<List<Integer>> quad(int n, int[] arr){
        List<List<Integer>> result = new ArrayList<>();
        int len = arr.length;
        Arrays.sort(arr);
        
        for(int i = 0;i<len;i++){
            System.out.println("nkvf");
            if(i!=0 && (arr[i] == arr[i-1])) continue;
                for(int j = i+1; j<len;j++){
                    if(j!=i+1 && arr[j] == arr[j-1]) continue;

                    int k = j+1;
                    int l = len-1;

                    while(k<l){
                    int sum = arr[i] + arr[j] + arr[k] + arr[l];

                    if(sum < n){
                        k++;
                    }else if(sum > n){
                        l--;
                    }else{
                        List<Integer> inner = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
                        result.add(inner);

                        k++;
                        l--;

                        while(k<l && arr[k] == arr[k-1])k++;
                        while(k<l && arr[l] == arr[l+1])l--; 
                    }
                System.out.println(result);
        }
                }
    }
        return result;
    }
}