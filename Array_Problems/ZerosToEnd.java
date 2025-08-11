package Array_Problems;

//This is tuf's logic, mine is commented, mine is inefficient
public class ZerostoEnd {
    public static int[] moveZeros(int n, int []a) {
        int j = -1;
        //place the pointer j:
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }

        //no non-zero elements:
        if (j == -1) return a;

        //Move the pointers i and j
        //and swap accordingly:
        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                //swap a[i] & a[j]:
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                j++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        int[] ans = moveZeros(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }
}
// public class ZerosToEnd {
//     public static void main(String[] args) {
//         int[] arr = {2,2,1};
//         toEnd(arr);

//         for(int i = 0;i<arr.length;i++){
//             System.out.print(arr[i]+",");

//         }

//     }

//     private static void toEnd(int[] arr){

//         for(int i = 0;i<arr.length-1;i++){
//             if(arr[i] == 0 && arr[i+1]!=0){
//                 int temp = arr[i+1];
//                 arr[i+1] = arr[i];
//                 arr[i] = temp;
//             }
//             else if(arr[i]==0 && arr[i+1] == 0){
//                 int old = i;
//                 int j = i;
//                 while(arr[j]==0 && j < arr.length-1){
//                 j++;
//             }
//             int temp = arr[j];
//             arr[j] = arr[old];
//             arr[old] = temp;
//     }
//         }
//     }
// }
