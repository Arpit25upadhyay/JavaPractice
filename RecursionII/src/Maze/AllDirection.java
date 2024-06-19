package Maze;

import java.util.ArrayList;
import java.util.Arrays;

public class AllDirection {
    public static void main(String[] args) {
        boolean[][] arr = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        System.out.println(allDir("", 0,0, arr));

    }

    public static ArrayList allDir(String s, int r, int c, boolean[][] arr){
        ArrayList<String> ans = new ArrayList<>();
        if(r==(arr.length-1) && c == (arr[0].length-1)){
            ans.add(s);
            return ans;
        }

        if(!arr[r][c]) return ans;

        if(r < arr.length-1){
            arr[r][c] = false;
            ans.addAll(allDir(s+"D", r+1, c, arr));
        }
        if(c < arr.length-1){
            arr[r][c] = false;
            ans.addAll(allDir(s+"R", r, c+1, arr));
        }
        if (r>0){
            arr[r][c] = false;
            ans.addAll(allDir(s+"U", r-1, c, arr));
        }
        if (c>0){
            arr[r][c] = false;
            ans.addAll(allDir(s+"L", r, c-1, arr));
        }
        return ans;
    }



}
