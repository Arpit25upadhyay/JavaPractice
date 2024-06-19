package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueenRevision {
    public static void main(String[] args) {
        int n = 4;
        char[][] arr = {
                {'.','.','.','.'},
                {'.','.','.','.'},
                {'.','.','.','.'},
                {'.','.','.','.'}
        };

        List<List<String>> ans = placeQueens(arr, 0);

        for (List l : ans){
            System.out.println(l);
        }
    }

    private static List<List<String>> placeQueens(char[][] arr, int r) {
        List<List<String>> res = new ArrayList<>();
        if(r == arr.length){
            res.add(arrToString(arr));
            return res;
        }



        for(int c = 0; c<arr[r].length; c++){
            if(isValid(arr, r, c)){
                arr[r][c] = 'Q';
                res.addAll( placeQueens(arr, r+1));
                arr[r][c] = '.';
            }
        }
        return res;
    }

    public static List<String> arrToString(char[][] arr){
        List<String> ans = new ArrayList<>();

        for(char[] a : arr){
            String s = "";
            for(char c : a){
                s += c;
            }
            ans.add(s);
        }

        return ans;
    }

    private static boolean isValid(char[][] arr, int r, int c) {

        for (int i = 0; i < r; i++) {
            if(arr[i][c] == 'Q') return false;
        }

        for (int i = 1; i <= Math.min(r,c); i++) {
            if(arr[r-i][c-i] == 'Q') return false;
        }

        for (int i = 1; i <= Math.min(r, arr.length-c-1) ; i++) {
            if(arr[r-i][c+i] == 'Q') return false;
        }

        return true;
    }
}
