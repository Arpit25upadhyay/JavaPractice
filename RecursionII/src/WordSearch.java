public class WordSearch {
    static int[][] direction = {{1,0},{-1,0},{0,1},{0,-1}};
    public static void main(String[] args) {
        char[][] arr = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        //System.out.println(exist(arr, word));
        System.out.println(myWay(arr,word));
    }

    private static boolean myWay(char[][] arr, String word) {
        for (int i = 0; i< arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                if(arr[i][j] == word.charAt(0) && wordSearch(arr, word, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean wordSearch(char[][] arr, String word, int r, int c, int idx){
        if(idx == word.length()) return true;

        if(arr[r][c] == '&') return false;

        if(arr[r][c] != word.charAt(idx)) return false;

        char temp = arr[r][c];
        arr[r][c] = '&';

        if(r< arr.length-1){
            return wordSearch(arr, word, r+1, c, idx+1);
        }
        if(c< arr[0].length-1){
            return wordSearch(arr, word, r, c+1, idx+1);
        }
        if(r > 0){
            return wordSearch(arr, word, r-1, c, idx+1);
        }
        if(c > 0){
            return wordSearch(arr, word, r, c-1, idx+1);
        }
        arr[r][c] = temp;
        return false;
    }

    public static boolean exist(char[][] board, String word) {
        for(int i= 0; i<board.length; i++){
            for(int j= 0; j<board[0].length; j++){
                if(board[i][j] == word.charAt(0) && find(board, i, j, 0, word)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean find(char[][] board, int i, int j, int idx, String word){
        if(idx == word.length()) return true;

        if(i<0 || j<0 || i>=board.length || j>=board[0].length) return false;

        if(board[i][j] == '$') return false;

        if(board[i][j] != word.charAt(idx)) return false;

        char temp = board[i][j];
        board[i][j] = '$';
        for(int[] d : direction){
            int i_new = i+d[0];
            int j_new = j+d[1];
            if( find(board, i_new, j_new, idx+1, word)) return true;
        }
        board[i][j] = temp;

        return false;

    }
}
