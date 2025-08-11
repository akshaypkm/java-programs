package Famouse_Problems;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class AllDivisors{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(returnDivisors(n));

    }
    public static List<Integer> returnDivisors(int n){
        List<Integer> list = new ArrayList<>();

        if(n<=0){
            return list;
        }
        int sqrt = (int) Math.sqrt(n);
        for(int i = 1;i<=sqrt;i++){
            if(n%i == 0){
                list.add(i);
                if(i != n/i){
                    list.add(n/i);
                }
            }
        }
        list.sort(null);
        return list;
    }
}