import java.util.Arrays;

public class ImageFlip {public static void main(String[] args) {
    int[][] img = new int[][]{
            {1,0,1},
            {1,0,1},
            {0,0,0}
    };

    for(int[] a: flipAndInvertImage(img)){

        System.out.println(Arrays.toString(a));
    }

}
    public static int[][] flipAndInvertImage(int[][] image) {

//        for(int r = 0; r < image.length; r++){
//            for(int c = 0; c < image[r].length; c++){
//                int temp = image[r][c];
//                image[r][c] =image[r][image[r].length - c - 1];
//                image[r][image[r].length - c - 1] =temp;
//            }
//        }

        for(int[] row : image){
            int i = 0;
            int j = row.length -1;
            while(i<j){
                int temp  = row[j];
                row[j] = row[i];
                row[i] = temp;
                i++;
                j--;
            }
        }


        for(int[] row : image){
            for(int i = 0; i< row.length; i++){
                row[i] = 1- row[i];
            }
        }
        return image;

    }

}
