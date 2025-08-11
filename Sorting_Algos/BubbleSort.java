package Sorting_Algos;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 20, 4, 2, 8};

        bubbleSort(arr);

        // 👉 Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // 👉 Your bubble sort logic goes here
    public static void bubbleSort(int[] arr) {
        for(int i = 0; i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
