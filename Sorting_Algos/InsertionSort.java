package Sorting_Algos;

public class InsertionSort{


    public static void main(String[] args) {
        int[] arr = {5, 20, 4, 2, 8};

        sort(arr);

        // 👉 Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }

    } 

    public static void sort(int[] arr){
        for(int i = 1; i < arr.length;i++){

            int j = i+1;
            while(arr[j] < arr[i-1]){
                i--;
            }
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
    }
}

}