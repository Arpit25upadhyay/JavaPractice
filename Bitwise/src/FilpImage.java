//Google question
//https://leetcode.com/problems/flipping-an-image/
public class FilpImage {
    public static void main(String[] args) {

        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};

        System.out.println(flipAndInvertImage(image));


    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] ans = new int[image.length][image.length];

        for(int i = 0 ; i <image.length; i++){

            int newCol = 0;
            for(int j = image.length-1; j>=0; j--){
                ans[i][newCol] = image[i][j]^1;
                newCol++;
            }
        }
        return ans;
    }


}
