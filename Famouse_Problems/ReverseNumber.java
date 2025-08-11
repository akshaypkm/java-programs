package Famouse_Problems;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int reversed = 0;
        while(N>0){
            int remain = N%10;
            N = N/10;
            reversed = reversed*10 + remain;
        }

        System.out.println(reversed);
    }
}
