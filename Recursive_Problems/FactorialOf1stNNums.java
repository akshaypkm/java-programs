package Recursive_Problems;

import java.util.Scanner;

public class FactorialOf1stNNums {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(facto(n));
    }
    static int fact = 1;
    public static int facto(int n){
        if(n>0){
            fact = fact*n;
            n--;
            facto(n);
        }
        return fact;
    }
}
