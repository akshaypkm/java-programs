package Array_Problems;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        findMissing(arr, 6);
    }

    public static void findMissing(int[] arr, int n) {
        int expectedSum = n*(n+1)/2;
        int sum = 0;

        for(int num : arr){
            sum = sum+num;
        }
        System.out.println("missing num: "+ (expectedSum - sum));
    }
}
