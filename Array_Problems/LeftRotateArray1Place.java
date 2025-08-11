package Array_Problems;

public class LeftRotateArray1Place {
    public static void main(String[] args) {
        int[] arr = {2, 8, 1, 4, 6, 9};
        rotate(arr);
        for(int num : arr){
            System.out.print(num);
        }
    }

    private static void rotate(int[] arr){
        int temp = arr[0];

        for(int i=0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }

        arr[arr.length -1] = temp;
    }
}
