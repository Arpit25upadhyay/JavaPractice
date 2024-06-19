package Backtracking;

import java.util.Arrays;

public class SudokuSolver {
    public static void main(String[] args) {

        int[][] sudoku = {
                {5,3,0, 0,7,0, 0,0,0},
                {6,0,0, 1,9,5, 0,0,0},
                {0,9,8, 0,0,0, 0,6,0},
                {8,0,0, 0,6,0, 0,0,3},
                {4,0,0, 8,0,3, 0,0,1},
                {7,0,0, 0,2,0, 0,0,6},
                {0,6,0, 0,0,0, 2,8,0},
                {0,0,0, 4,1,9, 0,0,5},
                {0,0,0, 0,8,0, 0,7,9}
        };

        sudokuSolve(sudoku, 0);
    }

    public static void sudokuSolve(int[][] sudoku, int row){
        if(row == sudoku.length ){
            for(int[] a : sudoku){
                System.out.println(Arrays.toString(a));
            }
            System.out.println();
            return;
        }

        for(int c = 0; c<sudoku[row].length; c++){
            if(sudoku[row][c] == 0){
                for(int val = 1; val<=9; val++){
                    if(isSafe(sudoku, row, c, val)){
                        sudoku[row][c] = val;
                        sudokuSolve(sudoku, row);
                        sudoku[row][c] = 0;
                    }
                }
                return;
            }
        }
        sudokuSolve(sudoku, row + 1);
    }

    public static boolean noZero(int[][] sudoku){
        for(int[] a : sudoku){
            for (int i = 0; i < a.length ; i++) {
                if(a[i] == 0) return false;
            }
        }
        return true;
    }

    public static boolean isSafe(int[][] sudoku, int r, int c, int val){

        //check row
        for(int i = 0; i<sudoku.length; i++){
            if(sudoku[r][i] == val) return false;
        }

        //check col
        for(int i = 0; i<sudoku.length; i++){
            if(sudoku[i][c] == val) return false;
        }

        int startRow = r-(r%3);
        int startCol = c-(c%3);

        for(int i = startRow; i<startRow+3; i++){
            for(int j = startCol; j<startCol+3; j++){
                if(sudoku[i][j] == val) return false;
            }
        }

        return true;
    }
}
