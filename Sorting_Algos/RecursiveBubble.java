package Sorting_Algos;

public class RecursiveBubble {
    public static void main(String[] args) {
        int[] arr = {5, 20, 4, 2, 8};
    
        bubbleSort(arr, arr.length);

        // 👉 Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
    }

    public static void bubbleSort(int[] arr, int n){
        if(n==1){ return ;}
        int didSwap = 0;
        for(int j =0; j<=n-2;j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                didSwap = 1;
            }
        }
        if(didSwap == 0){
            return;
        }
        bubbleSort(arr, n-1);
    }
    }