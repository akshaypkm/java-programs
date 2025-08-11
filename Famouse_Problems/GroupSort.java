package Famouse_Problems;

import java.util.*;

public class GroupSort {
    public static List<List<Integer>> groupSort(List<Integer> arr) {
        List<List<Integer>> result = new ArrayList<>();
        
        for(int num : arr){
            boolean found = false;
            for(List<Integer> inner : result){
                if(inner.get(0) == num){
                    found = true;
                    inner.set(1,  inner.get(1)+1);
                    break;

                }
            }
            if(!found){
                List<Integer> list = new ArrayList<>();

                list.add(num);
                list.add(1);
                result.add(list);
            }
            
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(5,5,5,6,6,6,4,4,4,3, 3, 1, 2, 1);

        
        List<List<Integer>> result = groupSort(arr);

        result.sort((a,b) ->{ 
        int freqCount = b.get(1).compareTo(a.get(1));
        
        if(freqCount != 0)return freqCount;
        return a.get(0).compareTo(b.get(0));
    });
                System.out.println(result);

    }
}
