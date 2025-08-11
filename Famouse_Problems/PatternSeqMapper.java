package Famouse_Problems;

import java.util.*;

public class PatternSeqMapper{
    public static void main(String[] args) {
        String input = "ABAaBAC";
        int count = 1;
        Map<Character, Integer> map = new HashMap<>();

        StringBuilder build = new StringBuilder();

        for(char ch : input.toUpperCase().toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch,count++);
            }

            int val  = map.get(ch);
            build.append(val).append(" ");
        }
        System.out.println(build);
    }
}