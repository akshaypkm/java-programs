package Array_Problems;

public class RotateArraykPlaces{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 3;
        String dir = "right";
        rotate(arr, k,  dir);
        for(int num : arr){
            System.out.print(num);
        }
        System.out.println();
    }

    private static void rotate(int[] arr, int k, String dir){
        
        if(dir == "left"){
        for(int j = 0; j<k;j++){
        int temp = arr[0];

        for(int i=0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }

        arr[arr.length -1] = temp;
    }
    }else if(dir=="right"){
        for(int j = 0;j<k;j++){
            int temp = arr[arr.length-1];
            for(int i = arr.length-1;i>0;i--){
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
        }
    }
}
}
