package Hashing_Problems;

import java.util.*;

public class FrequencyExtremes {
    public static void main(String[] args) {
        int[] arr = {2,2,2,3,3};

       HashMap<Integer, Integer> hmap = new HashMap<>();

       for(int i = 0;i<arr.length;i++){
            if(hmap.containsKey(arr[i])){
                int val = hmap.get(arr[i]);
                hmap.put(arr[i], ++val);
            }
            else{
                hmap.put(arr[i],1);
            }
        }
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;

        int maxKey = 0;
        int minKey = 0;

        Set<Map.Entry<Integer, Integer>> entrySet = hmap.entrySet();
        for(Map.Entry<Integer,Integer> entry : entrySet){
            Integer key  = entry.getKey();
            Integer value = entry.getValue();

            if(value>maxVal){
                maxVal = value;
                maxKey = key;
            }
            if(value<minVal){
                minVal = value;
                minKey = key;
            }
        }
        System.out.println("max key "+maxKey+" freq "+maxVal);
        System.out.println("min key "+minKey+" freq "+minVal);
    }
}
