package Array_Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort012s {
    public static void main(String args[]) {
        int n = 6;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        System.out.println(arr.size());
        
        sortArray(arr, n);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

    }

    public static void sortArray(ArrayList<Integer> arr, int n){
        int low = 0;
        int high = arr.size()-1;
        int mid = 0;
while(mid<=high){
        if(arr.get(mid) == 2){
            int temp = arr.get(high);
            arr.add(high, arr.get(mid));
            arr.add(mid,temp);

            high--;
        }
        else if(arr.get(mid) == 1){
            mid++;
        }
        else if(arr.get(mid) == 0){
            int temp = arr.get(mid);
            arr.add(mid, arr.get(low));
            arr.add(low, temp);
        mid++;
        low++;

        }
    }

}
}
