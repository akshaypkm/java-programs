package Famouse_Problems;
import java.util.*;

class Main {
    static Set<Integer> l = new HashSet<>();

    public static String checkSequenceTermination(int n) {
        if(n%2 == 0){
            if(l.contains(n)){
                return "NO";
            }
            if(n == 1){
                return "YES";
            }
            int reEnter = n/2;
            l.add(n);
            return checkSequenceTermination(reEnter);
        }else{
            if(l.contains(n)){
                return "NO";
            }
            if(n == 1){
                return "YES";
            }
            int reEnter = (3*n )+ 3;
            l.add(n);
            return checkSequenceTermination(reEnter);
        }
       
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            
            // Call user logic function and print the output
            String result = checkSequenceTermination(n);
            System.out.println(result);
        }
    }
}