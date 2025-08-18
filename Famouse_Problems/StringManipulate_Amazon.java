package Famouse_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;



public class StringManipulate_Amazon {
    public static List<Integer> getDistinctCharacters(int n, String data, List<List<Integer>> queries) {

        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i<queries.size();i++){
            List<Integer> inner = queries.get(i);
            int first = inner.get(0);
            int second = inner.get(1);
            int third = inner.get(2);

            if(first == 1){
                data = builder(data, second, third, n);
            }else if(first == 2){
                ans = mapper(data, second, third, ans);
            }
            System.out.println("after i "+i+ " "+data);
        }
        return ans;
    }

    private static List<Integer> mapper(String data, int second, int third, List<Integer> ans){
        Map<Character, Integer> map = new HashMap<>();

        for(int iter = second-1; iter<third;iter++){
            int val = map.getOrDefault(data.charAt(iter), 0);
            map.put(data.charAt(iter), ++val);
        }
        
        ans.add(map.size());
        System.out.println("List "+ans);
        return ans;
    }
    private static String builder(String data, int second, int third, int n){
        char[] charArr = data.toCharArray();
        char letter = (char) (97 - 1 + third);
        charArr[second-1] = letter;

        data = new String(charArr);
        return data;
    }
    public static void main(String[] args) {
        // Hardcoded test input
        int n = 7;
        String data = "abccbda";
        
        // queries = [[2,3,6], [1,2,3], [2,2,4], [1,1,5], [2,1,7]]
        List<List<Integer>> queries = new ArrayList<>();
        queries.add(Arrays.asList(2, 3, 6));
        queries.add(Arrays.asList(1, 2, 3));
        queries.add(Arrays.asList(2, 2, 4));
        queries.add(Arrays.asList(1, 1, 5));
        queries.add(Arrays.asList(2, 1, 7));

        List<Integer> result = getDistinctCharacters(n, data, queries);

        System.out.println(result);  // expected output: [3, 1, 5]
    }
}
