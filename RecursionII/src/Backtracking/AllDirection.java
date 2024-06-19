package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class AllDirection {
    public static void main(String[] args) {
        boolean[][] arr = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        //allDirStr("",0, 0, arr);
        //System.out.println(allDir("", 0, 0, arr));

        int [][] arr2 = {
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };
        allDirArray("", 0,0, arr2, 1);
    }

    public static ArrayList allDir(String s, int r, int c, boolean[][] arr){
        ArrayList<String> ans = new ArrayList<>();
        if(r == arr.length-1 && c == arr[0].length-1){
            ans.add(s);
            return ans;
        }

        if(!arr[r][c]) return ans;

        arr[r][c] = false;
        if(r < arr.length-1){
            ans.addAll(allDir(s + "D", r+1,c, arr));
        }
        if(c < arr[0].length-1){
            ans.addAll(allDir(s + "R", r,c+1, arr));
        }
        if(r > 0){
            ans.addAll(allDir(s + "U", r-1,c, arr));
        }
        if(c > 0){
            ans.addAll(allDir(s + "L", r,c-1, arr));
        }
        arr[r][c]= true;
        return  ans;
    }

    public static void allDirStr(String s, int r, int c, boolean[][] arr){

        if(r == arr.length-1 && c == arr[0].length-1){
            System.out.println(s);
            return;
        }

        if(!arr[r][c]) return;

        arr[r][c] = false;
        if(r < arr.length-1){
            allDirStr(s + 'D', r+1,c, arr);
        }
        if(c < arr[0].length-1){
            allDirStr(s + 'R', r,c+1, arr);
        }
        if(r > 0){
            allDirStr(s + 'U', r-1,c, arr);
        }
        if(c > 0){
            allDirStr(s + 'L', r,c-1, arr);
        }

        arr[r][c]= true;

    }

    public static void allDirArray(String s, int r, int c, int[][] arr, int step){
        ArrayList<String> ans = new ArrayList<>();
        if(r==(arr.length-1) && c == (arr[0].length-1)){
            System.out.println(s);
            arr[r][c] = step;
            for(int[] a : arr){
                System.out.println(Arrays.toString(a));
            }
            System.out.println();
            return;
        }

        if(arr[r][c] != 0) return;

        arr[r][c] = step;
        if(r < arr.length-1) allDirArray(s+'D', r+1, c, arr, step+1);

        if(c < arr.length-1) allDirArray(s+'R', r, c+1, arr, step+1);

        if (r>0) allDirArray( s+'U',r-1, c, arr, step+1);

        if (c>0) allDirArray(s+'L', r, c-1, arr, step+1);

        arr[r][c] = 0;
    }


}
