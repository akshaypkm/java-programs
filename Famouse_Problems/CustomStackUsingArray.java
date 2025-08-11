package Famouse_Problems;
public class CustomStackUsingArray{
    public static void main(String[] args){
        int[] arr = {-1,-1,-1,-1,-1};

        
        addEle(arr, 1);
        addEle(arr, 7);
        addEle(arr, 3);
        addEle(arr, 4);

        printArr(arr);

        peek(arr);

        popEle(arr);

        printArr(arr);
        
    }


    public static void peek(int[] arr){
        int i = 0;
        
        while(arr[i] == -1){
            i++;
        }
        System.out.println(arr[i]);
             
    }

    public static void addEle(int[] arr, int n){
        int len = arr.length;
        while(arr[len-1]!=-1){
            len = len-1;
        }
        arr[len-1] = n;
    }

    public static int popEle(int[] arr){
        int i = 0;
        
        while(arr[i] == -1){
            i++;
        }
        int var = arr[i];
        arr[i] = -1;
        return var;
    }

    public static void printArr(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
            }
            System.out.println("------------");
    }

    
}

