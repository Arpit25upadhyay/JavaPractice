package Backtracking;

import java.util.ArrayList;
import java.util.Collections;

public class ratMazePra {
    public static void main(String[] args) {
        int[][] a = {
                {1,0,0,0},
                {1,1,0,1},
                {1,1,0,0},
                {0,1,1,1}
        };

        ArrayList<String> res = findPath(a, a.length);
        Collections.sort(res);
        if (res.size() > 0) {
            for (int i = 0; i < res.size(); i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        } else {
            System.out.println(-1);
        }
    }



    public static ArrayList<String> findPath(int[][] m, int n) {
        if(m[0][0] == 1){
            return path(0, 0, m, n, "");
        }
        return new ArrayList<>();
    }

    public static ArrayList<String> path(int r, int c, int[][]m, int len, String ans){
        ArrayList<String> res = new ArrayList<>();
        if(r == len-1 && c == len-1){
            res.add(ans);
            return res;
        }

        m[r][c] = 0;
        if(r+1 < len && m[r+1][c] != 0){
            res.addAll(path(r+1,c,m,len, ans+"D"));
        }
        if(c-1 >= 0 && m[r][c-1] != 0){
            res.addAll(path(r,c-1,m,len, ans+"L"));
        }
        if(c+1 < len && m[r][c+1] != 0){
            res.addAll(path(r,c+1,m,len, ans+"R"));
        }
        if(r-1 >= 0 && m[r-1][c] != 0){
            res.addAll(path(r-1,c,m,len, ans+"U"));
        }
        m[r][c] = 1;

        return res;

    }
}
