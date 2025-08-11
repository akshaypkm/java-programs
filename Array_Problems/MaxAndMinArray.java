package Array_Problems;

public class MaxAndMinArray {
    public static void main(String[] args) {
        int[] arr = {2, 8, 1, 4, 6, 9};
        findMaxMin(arr);
    }

    public static void findMaxMin(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for(int i = 1; i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }else if(max<=arr[i]){
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
