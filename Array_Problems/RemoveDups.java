package Array_Problems;

public class RemoveDups{
    public static void main(String[] args){
        int[] arr = {1,2,2,4};
        int curr = 1;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>arr[i-1]){
                arr[curr] = arr[i];
                curr++;
            }
        }
        for(int num =0;num<curr;num++){
            System.out.println(arr[num]);
        }
    }

}