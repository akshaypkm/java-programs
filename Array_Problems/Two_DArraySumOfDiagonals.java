package Array_Problems;

public class Two_DArraySumOfDiagonals {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int sum = 0;
        for(int i = 0;i<arr[0].length;i++){
            sum += arr[i][i]; 
        }
        System.out.println(sum);

        int sum2 = 0;
        for(int i = 0;i<arr[0].length;i++){
            sum2 += arr[i][arr.length - i - 1];
        }
        System.out.println(sum2);

    }
}
