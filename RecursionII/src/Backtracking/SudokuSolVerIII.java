package Backtracking;

import java.util.Arrays;

public class SudokuSolVerIII {
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        if(solve(board)){
            for (char[] ch : board){
                System.out.println(Arrays.toString(ch));
            }
        }else{
            System.out.println("Not Possible");
        }

        System.out.println(solveCount(board));

    }

    public static int solveCount(char[][] board){
        int count = 0;
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean isSolved = true;

        for (int i = 0; i < n; i++) {
            for(int j = 0; j<n; j++){
                if(board[i][j] == '.'){
                    row = i;
                    col = j;
                    isSolved = false;
                    //. mil gaya break krdo
                    break;
                }
            }
            //row me . mil gaya break krdo aage ka kaam kro ab
            if (!isSolved) break;
        }

        if (isSolved) return 1;

        for(int val = 1; val<=9; val++){
            if(isSafe(board,row,col,val)){
                board[row][col] = (char)(val + '0');
                count += solveCount(board);
                board[row][col] = '.';
            }
        }
        return count;
    }



    public static boolean solve(char[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean isSolved = true;

        for (int i = 0; i < n; i++) {
            for(int j = 0; j<n; j++){
                if(board[i][j] == '.'){
                    row = i;
                    col = j;
                    isSolved = false;
                    //. mil gaya break krdo
                    break;
                }
            }
            //row me . mil gaya break krdo aage ka kaam kro ab
            if (!isSolved) break;
        }

        if (isSolved) return true;

        for(int val = 1; val<=9; val++){
            if(isSafe(board,row,col,val)){
                board[row][col] = (char)(val + '0');
                if(solve(board)){
                    return true;
                }else{
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }


    public static boolean isSafe(char[][] board, int row, int col, int val){

        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == (char) (val + '0')) {
                return false;
            }
        }

        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (val + '0')) {
                return false;
            }
        }

        int sqRoot = (int)Math.sqrt(board.length);
        int startR = row - row%sqRoot;
        int startC = col - col%sqRoot;

        for(int i = startR; i<startR+sqRoot; i++){
            for(int j = startC; j<startC+sqRoot; j++){
                if(board[i][j] == (char)(val + '0')) return false;
            }
        }
        return true;
    }
}

