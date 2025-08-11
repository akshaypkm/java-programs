package Famouse_Problems;
import java.util.*;

class LongestSubstringWithoutRepetition{
    public static void main(String[] args) {
        String s = new String();
        s = "abcdabcbb";
        
        System.out.println(findLongestSub(s));


    }
    public static int findLongestSub(String s){
        
        int count = 0;
        int prevCount = 0;

        ArrayList<Character> arr = new ArrayList<>();
        if(s.equals(" ")){
            return 1;
        }else if(s.length() == 1){
            return 1;
        }
        for(int i = 0; i<s.length(); i++){
            if(!arr.contains(s.charAt(i))){
                arr.add(s.charAt(i));
            }else{
                count = arr.size();
                if(count> prevCount){
                    prevCount = count;
                }
                while(arr.contains(s.charAt(i))){
                    arr.remove(0);
                }arr.add(s.charAt(i));
            }
        }
        if(arr.size()>prevCount){
            System.out.println(arr);
            return arr.size();
        }else{
            System.out.println(arr);
            return prevCount;
        }

    }
    
}