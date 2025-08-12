package Array_Problems;

import java.util.*;

public class SetMatrix0 {
    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        List<List<Integer>> use = new ArrayList<>();
       for(int i = 0; i<rows;i++){
        for(int j = 0;j<cols;j++){
            if(matrix[i][j] == 0){
                List<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(j);
                use.add(list);
            }
        }
       }
       System.out.println(use);
       for(List<Integer> inner : use){

        int i = inner.get(0);
        int j = inner.get(1);
        System.out.println(i);System.out.println(j);
        for(int a = 0;a<cols;a++){
            matrix[i][a] = 0;
        }
        for(int b = 0;b<rows;b++){
            matrix[b][j] = 0;
        }
        
       }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 1},
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 0}
        };

        setZeroes(matrix);

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}

