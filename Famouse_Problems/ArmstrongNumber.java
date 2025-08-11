package Famouse_Problems;
// 
import java.lang.Math;

public class ArmstrongNumber {
    // Function to check if a
    // number is an Armstrong number
    public static boolean isArmstrong(int num) {
        // Calculate the number of
        // digits in the given number
        int k = String.valueOf(num).length();
        // Initialize the sum of digits
        // raised to the power of k to 0
        int sum = 0;
        // Copy the value of the input
        // number to a temporary variable n
        int dup = num;
        // Iterate through each
        // digit of the number
        while(num > 0){
            // Extract the last
            // digit of the number
            int ld = num % 10;
            // Add the digit raised to
            // the power of k to the sum
            sum += Math.pow(ld,k);
            // Remove the last digit
            // from the number
            num = num / 10;
        }
        // Check if the sum of digits raised to
        // the power of k equals the original number
        return sum == dup
         ? true : false;
    }

    public static void main(String[] args) {
        int number = 153;
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}