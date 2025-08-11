package Famouse_Problems;
import java.util.*;

public class CountSubsets {
    public static int countTriplets(int n) {
        int count = 0;
        // int limit = 100; // Try -100 to +100 for a, b, c

        for (int a = 1; a <= n; a++) {
            for (int b = a; b <= n; b++) {
                for (int c = b; c <= n; c++) {
                    
                    int val = a * a + b * b + c * c + a * b + b * c + c * a;
                    if (val == n) {
                        System.out.println(a);
                        System.out.println(b);
                        System.out.println(c);
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countTriplets(n));
    }
}
