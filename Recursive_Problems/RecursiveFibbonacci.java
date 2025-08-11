package Recursive_Problems;

public class RecursiveFibbonacci {
    public static void main(String[] args){
        int n = 50;

        for(int i = 0; i<n;i++){
            System.out.print(callFibo(i) + " ");
        }
    }

    public static int callFibo(int n){
        if(n==0){ return 0;}
        if(n==1) return 1;

        return callFibo(n-1)+callFibo(n-2);
        
    }

}
