package Recursive_Problems;

// import java.util.ArrayList;

public class ReverseArrayRecursive {
    public static void main(String[] args){
    
        int[] arr = {1,2,3,4,5};
        int pointer = arr.length-1;
        int[] arr2 = new int[arr.length];
        int start = 0;
        System.out.println(reverseRecur(arr, pointer,arr2, start));
    }


    public static int[] reverseRecur(int[] arr, int pointer, int[] arr2, int start){
        if(pointer>=0){
            arr2[start] = arr[pointer];
            start++;
            pointer--;
        }
            return reverseRecur(arr, pointer, arr2, start);
        
    }
}
