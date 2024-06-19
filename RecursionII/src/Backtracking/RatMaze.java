package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class RatMaze {
    public static void main(String[] args) {
        int[][] maze = {
                {1,0,0,0},
                {1,1,0,1},
                {1,1,0,0},
                {0,1,1,1}
        };
        if(maze[0][0] != 1){
            System.out.println(new ArrayList<>());
        }else{
            findWays(0, 0, maze, "");
        }
    }

    public static void findWays(int r, int c, int[][] maze, String path){
        //List<String> ans = new ArrayList<>();
        if (r == maze.length - 1 && c == maze[0].length - 1){
            //ans.add(path);
            System.out.println(path);
            return;
        }
        maze[r][c] = 0;
        if(r+1< maze.length && maze[r+1][c] == 1){
            findWays(r+1, c, maze, path+"D");
        }
        if(c-1 >= 0 && maze[r][c-1] == 1){
            findWays(r, c-1, maze, path+"U");
        }
        if(c+1< maze[0].length && maze[r][c+1] == 1){
            findWays(r, c+1, maze, path+"R");
        }
        if(r-1 >= 0 && maze[r-1][c] == 1){
            findWays(r-1, c, maze, path+"L");
        }

        maze[r][c] = 1;
    }
}
