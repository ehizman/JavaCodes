package LeetCode;


public class MaximumAreaOfIsland {
    private static int[][] grid;
    private static boolean[][] array;

    private static int findFourDirection(int i, int j) {

        if (grid[i][j]==0||i>= grid.length||j>=grid[0].length || i<0||j<0 || array[i][j]){
            return 0;
        }
        array[i][j] = true;
        return (1 + findFourDirection(i-1,j) + findFourDirection(i+1,j) + findFourDirection(i,j-1) + findFourDirection(i,j+1));
    }

    public static int maxAreaOfIsland(int[][] grid) {
        MaximumAreaOfIsland.grid = grid;
        array = new boolean[grid.length][grid[0].length];

        int max = 0;
        for (int i = 0; i <= grid.length-1; i++){
            for(int j = 0; j <= grid[i].length-1; j++){
                max = Math.max(max, findFourDirection(i, j));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,
                1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
        int max = maxAreaOfIsland(grid);
        System.out.println(max);
    }
}