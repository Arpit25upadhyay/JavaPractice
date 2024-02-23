public class SpiralMatrix {
    public static void main(String[] args) {
        System.out.println(generateMatrix(3));
    }
    public static int[][] generateMatrix(int n) {

        int[][] ans = new int[n][n];

        int rowB = 0;
        int rowE = n-1;
        int colB = 0;
        int colE = n-1;

        int c = 1;

        while(rowB <= rowE && colB<=colE){

            //traversing right through the col
            for(int i = colB; i<=colE; i++){
                ans[rowB][i] = c;
                c++;
            }
            rowB++;

            //down
            for(int j = rowB ; j<=rowE; j++){
                ans[j][colE] = c;
                c++;
            }
            colE--;

            if(rowB <= rowE){
                //left
                for(int i = colE; i>=colB; i--){
                    ans[rowE][i] = c;
                    c++;
                }
                rowE--;
            }


            if(colB<=colE){
                //up
                for(int j = rowE; j>=rowB; j-- ){
                    ans[j][colB] = c;
                    c++;
                }
                colB++;
            }

        }
        return ans;
    }
}
