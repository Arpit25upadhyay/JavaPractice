package Backtracking;

public class WordSearchPractice {
    public static void main(String[] args) {
        char[][] block = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        String word = "ABCB";

        for(int i = 0;i<block.length; i++){
            for(int j = 0; j<block[0].length; j++){
                if(block[i][j] == word.charAt(0) && findWord(block, i, j, word)){
                //if(block[i][j] == word.charAt(0) && wordSearch(0, word, i, j, block)){
                    System.out.println(true);
                    return;
                }
            }
        }
        System.out.println(false);
    }

    private static boolean wordSearch(int idx, String word, int i, int j, char[][] block) {
        if(idx == word.length()) return true;

        if(i<0 || j<0 || i>=block.length || j>=block[0].length) return false;

        if(block[i][j] != word.charAt(idx)) return false;

        if(block[i][j] == '$') return false;

        char temp  = block[i][j];
        block[i][j] = '$';

        boolean ans = wordSearch(idx+1, word, i+1, j, block) || wordSearch(idx+1, word, i-1, j, block)||
                wordSearch(idx+1, word, i, j+1, block) || wordSearch(idx+1, word, i, j-1, block);

        block[i][j] = temp;
        return ans;
    }

    public static boolean findWord(char[][] board, int r, int c, String word){

        if(word.isEmpty()) return true;

        if(r<0 || c<0 || r>=board.length || c>=board[0].length) return false;

        if(board[r][c] != word.charAt(0)) return false;

        if(board[r][c] == '&') return false;


        char org = board[r][c];
        board[r][c] = '&';
        boolean found = findWord(board, r+1, c, word.substring(1)) || findWord(board, r-1, c, word.substring(1))
                ||findWord(board, r, c+1, word.substring(1)) || findWord(board, r, c-1, word.substring(1));
        board[r][c] = org;

        return found;
    }
}
