package Array_Problems;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr2 = {1, 2, 3};
        int[] arr1 = {4, 8, 9};
        merge(arr1, arr2);
    }

    public static void merge(int[] arr1, int[] arr2) {
        int p1 = 0;
        int p2 = 0;
        int i = 0;
        int[] fArr = new int[arr1.length + arr2.length]; 
        while(p1<arr1.length && p2<arr2.length){
            if(arr1[p1] < arr2[p2]){
                fArr[i] = arr1[p1];
                p1++;i++;
            }else{
                fArr[i] = arr2[p2];
                p2++;i++;
            }
        }

        while(p2<arr2.length){
            fArr[i++] = arr2[p2++];
        }
        while(p1<arr1.length){
            fArr[i++] = arr1[p1++];
        }
        

        for(int j = 0; j<fArr.length;j++){
            System.out.print(fArr[j]+" ");
        }
    }
}

