package FAANG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniquePaths {

    public static void main(String[] args) {

        numUniquePaths(3, 7);

    }

    public static int numUniquePaths(int m, int n) {
        int result = 0;
        int[][] grid = new int[m][n];

        for(int i=0; i < m; i++){
            grid[i][0] = 1;
        }
        for(int j = 0; j < n; j++)
            grid[0][j] = 1;

        for(int i = 1; i < m; i ++){
            for(int j = 1; j < n; j++){
                grid[i][j] = grid[i-1][j] + grid[i][j-1];
            }
        }

//        for(int i = m-1; i > 0; i--)
//            for(int j = n-1; j > 0; j--){
//                grid[i][j] = grid[i-1][j] + grid[i][j-1];
//            }
        System.out.println(Arrays.toString(grid[0]));
        System.out.println(Arrays.toString(grid[1]));
        System.out.println(Arrays.toString(grid[2]));
        return grid[m-1][n-1];


    }
}

//        int target = grid[m-1][n-1];
//        System.out.println(target);
//        int row = 0, col = 0, countTrav = 0, i = 0;
//
//        pathTraverse(grid, i, row, col, countTrav, Collections.singletonList(path));
//        return result;
//    }
//
//    private static void pathTraverse(int[][] grid, int i, int row, int col, int count, List path) {
//        if(grid[row][col] == target) {
//            count++;
//            i = 0;
//        }
//        System.out.println(Arrays.toString(grid[0]));
//        System.out.println(Arrays.toString(grid[1]));
//        System.out.println(Arrays.toString(grid[2]));
//
//        if( row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || current_path[i] = path[i] ){
//            return;
//        }
//        i ++;
//        grid[row][col] = 0;
//
//        pathTraverse(grid, row -1, col, path[i][grid[row][col]]);
//    }
//
////    public static void pathTraverse(int [][] grid, int m, int n, int [] path){
////        int [][] start = grid[0][0];
////        int [][] end = grid[m][n];
//
//
//
//}
