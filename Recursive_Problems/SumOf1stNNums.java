package Recursive_Problems;

import java.util.Scanner;

public class SumOf1stNNums {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(sumOf1st(n));
    }

    static int sum = 0;
    public static int sumOf1st(int n){
        if(n>0){
        sum = sum+n;
        n--;
        sumOf1st(n);
        }

        return sum;
    }
}
