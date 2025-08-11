package Recursive_Problems;

import java.util.Scanner;

public class Nto1Recursive {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long n = s.nextInt();

        goRecur(n);
    }

    public static void goRecur(long n){
        if(n>0){
            System.out.println(n);
            n--;
            goRecur(n);
        }
    }
}
