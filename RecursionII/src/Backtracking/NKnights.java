package Backtracking;

import java.util.Arrays;

public class NKnights {
    public static void main(String[] args) {
        char[][] ans2 = {
                {'*','*','*','*'},
                {'*','*','*','*'},
                {'*','*','*','*'},
                {'*','*','*','*'}
        };

        System.out.println(ways(ans2, 0, 0, 4));

    }

    public static int ways(char[][] ans, int r, int c, int k){
        int count =0;
        if(k == 0){
            for(char[] ch : ans){
                System.out.println(Arrays.toString(ch));
            }
            System.out.println();
            return 1;
        }

        if(r == ans.length-1 && c == ans[0].length-1 ) return 0;

        if(c == ans[0].length) return ways(ans, r+1,0,k);

        if(validMove(ans, r,c)){
            ans[r][c] = 'K';
            count += ways(ans, r, c+1, k-1);
            ans[r][c] = '*';
        }

        count += ways(ans, r, c+1, k);
        return  count;

    }


    public static boolean validMove(char[][] board, int r, int c){

        if(r-2 >=0 && c+1 < board[0].length && board[r-2][c+1] == 'K') return  false;
        if(r-2 >=0 && c-1 >= 0 && board[r-2][c-1] == 'K') return  false;
        if(r-1 >=0 && c+2 < board[0].length && board[r-1][c+2] == 'K') return  false;
        if(r-1 >=0 && c-2 >= 0 && board[r-1][c-2] == 'K') return  false;

        return  true;
    }
}

