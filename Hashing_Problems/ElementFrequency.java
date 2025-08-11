package Hashing_Problems;

import java.util.*;

public class ElementFrequency {
    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 15, 10, 5};

        Map<Integer, Integer> hmap = new HashMap<>();

        for(int i = 0;i<arr.length;i++){
            if(hmap.containsKey(arr[i])){
                int val = hmap.get(arr[i]);
                hmap.put(arr[i], ++val);
            }
            else{
                hmap.put(arr[i],1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entrySet = hmap.entrySet();
        for(Map.Entry<Integer,Integer> entry : entrySet){
            Integer key = entry.getKey();
            Integer val = entry.getValue();
            System.out.println(key+" occurs "+val+" times.");
        }
    }
}