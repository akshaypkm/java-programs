package Array_Problems;

import java.util.*;

public class LeadersInArray{
    public static void main(String args[]) {
        int[] arr = {1,5,4,3,6,2};
        ArrayList<Integer> result = leaders(arr);
        System.out.println(result);
    }

    private static ArrayList<Integer> leaders(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        if(arr.length == 0){return list;}

        int leader = arr[arr.length-1];
        list.add(leader);
        for(int i = arr.length-2;i>=0;i--){
            if(arr[i] > leader){
                leader = arr[i];
                list.add(leader);
            }
        }
        Collections.reverse(list);
        return list;
    }
}