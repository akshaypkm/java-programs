package Famouse_Problems;
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the number
        int n = sc.nextInt();
        
        // Call the function and print the result
        int digitCount = countDigits(n);
        System.out.println(digitCount);
    }

    // Function to count number of digits
    static int countDigits(int n) {
        // Logic will go here
        int count = 0;
        while(n!=0){
            n = n/10;
            count++;
        }
        return count;
    }
}
