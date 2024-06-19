package Maze;

import java.util.ArrayList;

public class ReachEnd {
    public static void main(String[] args) {
        int[][] arr  = new int[3][3];

        boolean[][] boolArr = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        System.out.println( countWays(0, 0));

        //System.out.println(countWaysInverse(3,3));

        System.out.println(printWays("",0,0));

        System.out.println(printWaysDiagonal("",0,0));

        System.out.println(printWaysObs("",0,0, boolArr));
    }



    public static int countWays(int i, int j){
        if(i == 2 || j == 2) return 1;

        int a = countWays(i+1, j);
        int b = countWays(i,j+1);
        return  a + b;

    }

    public static int countWaysInverse(int i, int j){
        if(i == 1 || j == 1) return 1;
        return countWaysInverse(i-1, j) + countWaysInverse(i,j-1);
    }

    public static ArrayList printWays(String s, int i, int j){
        ArrayList<String> ans = new ArrayList<>();
        if(i == 2 && j == 2) {
            ans.add(s);
            return ans;
        }
        if(i < 2){
           ans.addAll(printWays(s + "D",i+1, j));
        }
        if(j<2){
            ans.addAll(printWays(s+"R",i,j+1));
        }
        return ans;
    }

    public static ArrayList printWaysDiagonal(String s, int i, int j){
        ArrayList<String> ans = new ArrayList<>();
        if(i == 2 && j == 2) {
            ans.add(s);
            return ans;
        }
        if(i < 2){
            ans.addAll(printWaysDiagonal(s + "D",i+1, j));
        }
        if(j<2){
            ans.addAll(printWaysDiagonal(s+"R",i,j+1));
        }
        if(i<2&&j<2){
            ans.addAll(printWaysDiagonal(s+"dia"  , i+1, j+1));
        }
        return ans;
    }

    public static ArrayList printWaysObs(String s, int i, int j, boolean[][] arr){
        ArrayList<String> ans = new ArrayList<>();
        if(i == 2 && j == 2) {
            ans.add(s);
            return ans;
        }
//        if(i < 2 && !(i==1 && j==1)){
//            ans.addAll(printWaysObs(s + "D",i+1, j));
//        }
//        if(j<2 && !(i==1 && j==1)){
//            ans.addAll(printWaysObs(s+"R",i,j+1));
//        }

        if(!arr[i][j]) return ans;

        if(i < 2){
            ans.addAll(printWaysObs(s + "D",i+1, j,arr));
        }
        if(j < 2){
            ans.addAll(printWaysObs(s+"R",i,j+1, arr));
        }
        return ans;
    }
}
