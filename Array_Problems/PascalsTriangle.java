package Array_Problems;

import java.util.*;

public class PascalsTriangle{
    public static void main(String[] args){

        int num = 5;
        List<List<Integer>> result = pascal(num);


        for(List<Integer> inner : result){
            System.out.println(inner);
        }

    }

    private static List<List<Integer>> pascal(int num){

        List<List<Integer>> result = new ArrayList<>();
        if(num ==0 )return result;

        List<Integer> first = new ArrayList<>();

        first.add(1);
        result.add(first);

        if(num == 1)return result;

        for(int i = 1;i<num;i++){
            List<Integer> prev = result.get(i-1);

            List<Integer> inner = new ArrayList<>();

            inner.add(1);
            for(int j = 0;j<i-1;j++){
                inner.add(prev.get(j)+prev.get(j+1));
            }
            inner.add(1);

            result.add(inner);
        }

        return result;


    }
}