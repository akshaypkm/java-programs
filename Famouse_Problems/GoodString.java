package Famouse_Problems;
import java.util.*;

public class GoodString {

    // Function to convert input string to "good" string
    public static String makeGoodString(String s) {
        
        StringBuilder sb = new StringBuilder(s);

        for(int i = 0;i<sb.length(); i++){
            if(!Character.isLetter(sb.charAt(i))){
                sb.deleteCharAt(i);
                int j = i;
                while(j<sb.length()&&Character.isLetter(sb.charAt(j))== false){
                    j++;
                }
                if(j<sb.length()){sb.deleteCharAt(j);}
                i--;
            }
            
        }
        String str = sb.toString();
        return str; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String result = makeGoodString(input);

        System.out.println(result);
        
        
    }
}
