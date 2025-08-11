package Famouse_Problems;
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();

        
            for(int i = N2; i>0;i--){
                if(N1 % i == 0 && N2%i == 0){
                    System.out.println(i);
                    break;
                }else{
                    continue;
                }
            }
    }
}
