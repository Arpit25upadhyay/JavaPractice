package Backtracking;

public class PathWithMaxGold {
    public static void main(String[] args) {
        int[][] grid = {
                {0,6,0},
                {5,8,7},
                {0,9,0}
        };

        System.out.println(getMaximumGold(grid));
    }

    public static int getMaximumGold(int[][] grid) {
        int ans = Integer.MIN_VALUE;
        for(int r = 0; r<grid.length; r++){
            for(int c = 0; c<grid[0].length; c++){
                if(grid[r][c] != 0){
                    ans = Math.max(ans, findGold(r,c,grid, 0));
                }
            }
        }
        return ans;
    }

    public static int findGold(int r, int c, int[][] grid, int total){
        int ans = Integer.MIN_VALUE;
        return 0;
//        if(r == grid.length && )
    }
}
