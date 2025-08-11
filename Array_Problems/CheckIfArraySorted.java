package Array_Problems;

public class CheckIfArraySorted {
    public static void main(String[] args) {

        // Input array size
        int[] arr = {1,2,3,4,5};
    
        // Call the method
        System.out.println(checkSorted(arr));
    }

    private static boolean checkSorted(int[] arr){
        for(int i = 0; i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
