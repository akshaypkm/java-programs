package Famouse_Problems;
import java.util.Scanner;
import java.lang.Math;


public class PrimeCheck {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(primeCheck(n));
    
    }
    public static boolean primeCheck(int n){
        if(n<=1){return false;}

        int sqrt =  (int) Math.sqrt(n);
        System.out.println(sqrt);

        for(int i = 2; i<=sqrt;i++){
            if(n%i == 0){
                System.out.println(i);
                return false;
                
            }
            
        }
        return true;
    }

    
}
