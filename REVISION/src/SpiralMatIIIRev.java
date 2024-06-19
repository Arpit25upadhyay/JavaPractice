import java.util.ArrayList;

public class SpiralMatIIIRev{
    public static void main(String[] args) {
        int[][] mat = {
                {1,  2,  3, 4},
                {5,  6,  7, 8},
                {9, 10, 11, 12},
                {13,14, 15, 16}
        };
        int startR = 2;
        int startC = 2;

        System.out.println(printPath(mat, startR, startC));
    }

    public static ArrayList printPath(int[][] mat, int startR, int startC){
        ArrayList<Integer> ans = new ArrayList<>();
        int d = 0;
        int[] direction = {0,1,0,-1,0};
        ans.add(mat[startR][startC]);
        int i = 1;
        int steps = 0;
        while(i<mat.length* mat[0].length){
            if(d==0 || d==2) steps++;

            for(int k = 0; k<steps; k++){
                startR = startR + direction[d];
                startC = startC + direction[d+1];

                if(startR >=0 && startR < mat.length && startC>=0 && startC < mat[0].length){
                    ans.add(mat[startR][startC]);
                    i++;
                }
            }

            d = ++d;
            d = d%4;

        }
        return  ans;
    }
}
