package Recursive_Problems;

public class RecursiveNamePrint {
    public static void main(String[] args){
        int n = 5;

        recursive(n);
    }
    public static void recursive(int n){
        
        if(n!=0){
            System.out.println("Akshay");
            n--;
            recursive(n);
        }
    }
}
