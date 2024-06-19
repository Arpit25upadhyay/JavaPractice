package Backtracking;

import java.util.Arrays;

public class SudokuSolverII {
    public static void main(String[] args) {
        char[][] board =
                {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        solveSudoku(board);

    }
    public static void solveSudoku(char[][] board) {
//        sudokuSolver(board, 0,0);
//        for (char[] a : board){
//            System.out.println(Arrays.toString(a));
//        }

        sudokuBT(board, 0);
        for (char[] a : board){
            System.out.println(Arrays.toString(a));
        }

    }

    public static boolean sudokuBT(char[][] board, int row) {
        if (row == board.length) {
            if (noZero(board)) {
                return true;
            } else {
                return false;
            }
        }

        for (int c = 0; c < board.length; c++) {
            if (board[row][c] == '.') {
                for (int i = 1; i <= 9; i++) {
                    if (isSafe(board, row, c, (char) (i + '0'))) {
                        board[row][c] = (char) (i + '0');
                        if(sudokuBT(board, row)) return true;
                        board[row][c] = '.';
                    }
                }
                return false;
            }
        }
        return sudokuBT(board, row + 1);
    }

    public static boolean noZero(char[][] sudoku){
        for(char[] a : sudoku){
            for (int i = 0; i < a.length ; i++) {
                if(a[i] == '.') return false;
            }
        }
        return true;
    }



    public static boolean isSafe(char[][] board, int r, int c, char val) {
        // Check if the value is already present in the row
        for (int i = 0; i < board.length; i++) {
            if (board[r][i] == val)
                return false;
        }

        // Check if the value is already present in the column
        for (int i = 0; i < board.length; i++) {
            if (board[i][c] == val)
                return false;
        }

        // Calculate the top-left corner of the subgrid
        int sqRoot = (int) Math.sqrt(board.length);
        int startR = r - r % sqRoot;
        int startC = c - c % sqRoot;

        // Check if the value is already present in the subgrid
        for (int i = startR; i < startR + sqRoot; i++) {
            for (int j = startC; j < startC + sqRoot; j++) {
                if (board[i][j] == val)
                    return false;
            }
        }

        return true;
    }

    public static boolean sudokuSolver(char[][] board, int row, int col) {
        if (row == board.length) {
            return true; // All rows processed successfully
        }

        if (col == board[row].length) {
            return sudokuSolver(board, row + 1, 0); // Move to the next row
        }

        if (board[row][col] != '.') {
            return sudokuSolver(board, row, col + 1); // Move to the next column
        }

        for (char ch = '1'; ch <= '9'; ch++) {
            if (isSafe(board, row, col, ch)) {
                board[row][col] = ch;
                if (sudokuSolver(board, row, col + 1)) {
                    return true; // If solved successfully, return true
                }
                board[row][col] = '.'; // Undo the current cell
            }
        }

        return false; // No valid number can be placed in this cell
    }
}

