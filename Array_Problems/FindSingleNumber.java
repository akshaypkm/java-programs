package Array_Problems;

public class FindSingleNumber {
    public static void main(String[] args) {
        int[] arr = {4,4,5, 1, 2, 1, 2}; // Example: 4 is the unique one
        int result = findSingleNumber(arr);
        System.out.println("The single number is: " + result);
    }

    private static int findSingleNumber(int[] arr) {
        int xor = 0;
        for(int i = 0;i<arr.length;i++){
            xor = xor^arr[i];
        }
        return xor; // dummy return to avoid error
    }

}
