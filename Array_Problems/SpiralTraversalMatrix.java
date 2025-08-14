package Array_Problems;

import java.util.*;

public class SpiralTraversalMatrix {
    public static void main(String[] args) {
        
        //Matrix initialization.
        int[][] mat = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
        
        List<Integer> ans = printSpiral(mat);

        for(int i = 0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }

        System.out.println();
    }

    private static List<Integer> printSpiral(int[][] mat){
        List<Integer> list = new ArrayList<>();
        int n = mat.length;
        int m = mat[0].length;
        int left = 0, right = m-1, bottom = n-1, top = 0;

        while(top<=bottom && left<=right){
            for(int i = left;i<=right;i++){
                list.add(mat[top][i]);
            }
            top++;

            for(int j = top; j<=bottom; j++){
                list.add(mat[j][right]);
            }
            right--;

            //going from right to left
            if(top<=bottom){
            for(int i = right; i>=left;i--){
                list.add(mat[bottom][i]);
            }
            bottom--;
        }

        //going from bottom to top
        if(left<=right){
            for(int i = bottom;i>=top;i--){
                list.add(mat[i][left]);
            }
        }
        left++;
    }
        return list;
    }
}
