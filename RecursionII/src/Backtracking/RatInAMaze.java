package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class RatInAMaze {
    public static void main(String[] args) {
        int[][] maze = {
                {1,0,0,0},
                {1,1,0,1},
                {1,1,0,0},
                {0,1,1,1}
        };


        if(maze[0][0] == 1){
            System.out.println(findPath(maze, 0, 0, ""));
        }else{
            System.out.println(new ArrayList<>());
        }



        //TC = 4^n*m
    }

    private static List<String> findPath(int[][] maze, int r, int c, String ans) {
        List<String> res =  new ArrayList<>();
        if(r == maze.length-1 && c ==  maze[0].length-1){
            res.add(ans);
            return res;
        }



        if(r+1 < maze.length && maze[r+1][c] == 1){
            maze[r][c] = 0;
            res.addAll(findPath(maze,r+1,c,ans+"D"));
            maze[r][c] = 1;
        }
        if (c-1>=0  && maze[r][c-1] == 1){
            maze[r][c] = 0;
            res.addAll(findPath(maze, r, c-1,ans+"L"));
            maze[r][c] = 1;
        }
        if(c+1 < maze.length  && maze[r][c+1] == 1){
            maze[r][c] = 0;
            res.addAll(findPath(maze, r, c+1,ans+"R"));
            maze[r][c] = 1;
        }
        if (r-1>=0 && maze[r-1][c] == 1){
            maze[r][c] = 0;
            res.addAll(findPath(maze, r-1, c,ans+"U"));
            maze[r][c] = 1;
        }
        return res;

    }
}
