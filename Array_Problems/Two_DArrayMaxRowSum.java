package Array_Problems;

public class Two_DArrayMaxRowSum {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 300},
            {10, 20, 30},
            {4, 5, 600},
            {4, 5, 6}
        };

        int max = 0;
        int row = 0;
        for(int i = 0;i<arr.length;i++){
            int sum = 0;
            
            for(int j = 0;j<arr[0].length;j++){
                sum = sum + arr[i][j];
                
            }if(max < sum){
                    max = sum;
                    row = i;
                }
        }
        System.out.println("Row "+row+" has the max sum of "+max);
    }
}
