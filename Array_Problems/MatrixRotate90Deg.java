package Array_Problems;

public class MatrixRotate90Deg {
    public static void main(String args[]) {
        int arr[][] =  {{1, 2, 3 ,20}, {4, 5, 6, 30}, {7, 8, 9, 40}, {10, 11, 12, 50}};
        rotate(arr);
        System.out.println("Rotated Image");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void rotate(int[][] arr){
        for(int i=  0; i<arr.length;i++){
            for(int j = i; j<arr[0].length;j++){
                int temp = arr[i][j];
                arr[i][j]=  arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i=  0; i<arr.length;i++){
            for(int j = 0;j<arr.length /2;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr.length - 1-j];
                arr[i][arr.length - 1-j] = temp;
            }
        }
    }
}
