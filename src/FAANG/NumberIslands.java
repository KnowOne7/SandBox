package FAANG;

public class NumberIslands {
    public static void main(String[] args) {

        char [][] grid = new char[][] {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        numIslands(grid);
    }
    public static int numIslands(char[][] grid) {
        int count = 0;
        // find an island, transverse island's boarders, change all land to water so not to count again;
        if(grid == null)
            return 0;
        for( int i = 0; i < grid.length; i ++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    // transvers grid
                    bfs(grid, i, j);
                }
            }
        }
        System.out.println(count);
        return count;
    }

    public static void bfs(char[][] grid, int i, int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] != '1'){
            return;
        }
        else
            grid[i][j] = '0';

        bfs(grid, i-1, j);
        bfs(grid, i, j+1);
        bfs(grid, i+1, j);
        bfs(grid, i, j-1);



    }
}