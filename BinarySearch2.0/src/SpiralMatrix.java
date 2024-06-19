import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int [] ans = new int[12];
        int[][] a = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int top = 0;
        int left = 0;
        int right = a[0].length-1;
        int bottom = a.length-1;
        int idx =0;
        while(top<=bottom && left<=right){
            //l->r
            for(int i = left; i<= right; i++ ){
                ans[idx++] = a[top][i];
            }
            top++;
            //t->b
            for(int i = top; i<= bottom; i++ ){
                ans[idx++] = a[i][right];
            }
            right--;
            if(!(top<=bottom && left<=right)){
                break;
            }
            //r->l
            for(int i = right; i>=left; i--){
                ans[idx++] = a[bottom][i];
            }
            bottom--;

            //b->t
            for (int i = bottom; i>=top; i--){
                ans[idx++] = a[i][left];
            }
            left++;
        }

        System.out.print(Arrays.toString(ans));

    }
}
