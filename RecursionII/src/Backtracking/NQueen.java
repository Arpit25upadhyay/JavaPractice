package Backtracking;

import java.util.Arrays;

public class NQueen {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true, true},
                {true, true, true, true},
                {true, true, true, true},
                {true, true, true, true}
        };


        int[][] ans = {
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0}
        };

        char[][] ans2 = {
                {'*','*','*','*'},
                {'*','*','*','*'},
                {'*','*','*','*'},
                {'*','*','*','*'}
        };

        //ways(board, 0, 1, ans);

        System.out.println(waysII(ans2, 0, 0, 1));
    }

    public static void ways(boolean[][] board, int r, int q, int[][] ans){
        if(r == board.length){
            for(int[] a : ans){
                System.out.println(Arrays.toString(a));
            }
            System.out.println();
            return;
        }

        for(int c = 0; c< board.length; c++){
            if(validMove(board, r, c)){
                board[r][c] = false;
                ans[r][c] = q;
                ways(board, r+1, q+1, ans);
                board[r][c] = true;
                ans[r][c] = 0;
            }
        }
    }

    public static boolean validMove(boolean[][] board, int r, int c){

        //check in row
        for(int i = 0; i<r; i++){
            if(!board[i][c]) return false;
        }

        //check left diagonal
        for(int i = 1; i <= Math.min(r,c); i++){
            if(!board[r-i][c-i]) return false;
        }

        //check right diagonal
        for(int i = 1; i <= Math.min(board.length-c-1, r); i++){
            if(!board[r-i][c+i]) return false;
        }

        return  true;
    }



    public static int waysII(char[][] ans, int r, int c, int q){
        int count = 0;
        if(r == ans.length){
            for(char[] a : ans){
                System.out.println(Arrays.toString(a));
            }
            System.out.println();
            return 1;
        }



        for(int j = 0; j<ans[0].length; j++){
            if(validMoveII(ans, r, j)){
                ans[r][j] = 'Q';
                count += waysII(ans, r+1, j, q+1);
                ans[r][j] = '*';
            }
        }
        return count;
    }

    public static boolean validMoveII(char[][] board, int r, int c){

        //check in row
        for(int i = 0; i<r; i++){
            if(board[i][c] != '*') return false;
        }

        //check left diagonal
        for(int i = 1; i <= Math.min(r,c); i++){
            if(board[r-i][c-i] != '*') return false;
        }

        //check right diagonal
        for(int i = 1; i <= Math.min(board.length-c-1, r); i++){
            if(board[r-i][c+i] != '*') return false;
        }

        return  true;
    }



}
