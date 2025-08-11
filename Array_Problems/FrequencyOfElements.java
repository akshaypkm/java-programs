package Array_Problems;
import java.util.Map;
import java.util.HashMap;


public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3,7,66,66,66,66,66,66,87};
        frequency(arr);
    }

    public static void frequency(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int val = map.get(arr[i]);
                map.put(arr[i],++val);
            }else{
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
    }
}

