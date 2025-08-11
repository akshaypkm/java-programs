package Sorting_Algos;

public class Recursive_Insertion {
    public static void main(String[] args) {
        int[] arr = {5, 20, 4, 2, 8};

        recurse(arr, arr.length, 0);

        // 👉 Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
    private static void recurse(int[] arr, int n, int i){
        if(i == n){return;}
        
        int j = i;
        while(j>0 && arr[j-1] > arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }

        recurse(arr, n, i+1);

    }
}
