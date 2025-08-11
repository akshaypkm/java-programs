package Recursive_Problems;

import java.util.Scanner;


public class RecursivePalindromeCheck {
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    String Str = s.nextLine();
    int bp = Str.length()-1;
    int fp = 0;
        
    System.out.println(check(Str, fp, bp));
    }
    public static boolean check(String Str, int fp, int bp){
        if(fp>=bp) return true;

        if(Str.charAt(fp) != Str.charAt(bp)) return false;

        return check(Str, fp+1, bp-1);
    }
}
