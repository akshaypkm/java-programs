package Array_Problems;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;


public class FindDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2,4,3,3};
        findDuplicates(arr);
    }

    public static void findDuplicates(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int val = map.get(arr[i]);
                map.put(arr[i], ++val);
        }else{
            map.put(arr[i],1);
        }
    }
    Set<Integer> set = map.keySet();
    for(int key:set){
            if(map.get(key)>1){
                System.out.print(key +" ");
            }
        }

        System.out.println(map.entrySet());
}
}
