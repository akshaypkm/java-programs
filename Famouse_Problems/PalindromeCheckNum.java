package Famouse_Problems;
import java.util.Scanner;

public class PalindromeCheckNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        boolean isPalindrome = isPalindrome(N);

        System.out.println(isPalindrome);
    }

    public static boolean isPalindrome(int N){
        int reversed = 0;
        int dup = N;
        while(N>0){
            int remain = N%10;
            N = N/10;
            reversed = reversed*10 + remain;
        }
        System.out.println(reversed);
        if(reversed == dup){
            return true;
        }else{
            return false;
        }
    }
}
