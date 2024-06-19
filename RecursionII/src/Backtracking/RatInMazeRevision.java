package Backtracking;

public class RatInMazeRevision {
    public static void main(String[] args) {
        int N = 4;
        int[][] m = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };

        if(m[0][0] == 0){
            System.out.println("No Path");
        }else {
            findPath(0, 0, m, N,"");
        }
    }

    public static void findPath(int r, int c, int[][] maze, int N, String ans){
        if(r == N-1 && c == N-1){
            System.out.println(ans);
            return;
        }

        //if(maze[r][c] == 0) return;

        if(r+1<N && maze[r+1][c] != 0){

            maze[r][c] = 0;
            findPath(r+1,c,maze,N,ans +"D");
            maze[r][c] = 1;
        }
        if(c-1>=0 && maze[r][c-1] != 0){

            maze[r][c] = 0;
            findPath(r,c-1,maze,N,ans+"L");
            maze[r][c] = 1;
        }
        if(c+1<N && maze[r][c+1] != 0){

            maze[r][c] = 0;
            findPath(r,c+1,maze,N,ans+"R");
            maze[r][c] = 1;
        }if(r-1>=0 && maze[r-1][c] != 0){

            maze[r][c] = 0;
            findPath(r-1,c,maze,N,ans+"U");
            maze[r][c] = 1;
        }


    }
}
