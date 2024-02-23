import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr2D = new int[3][];
        int[][] arr2 = {
                {1,2,3},
                {4,5},
                {7,8,0,9}
        };

        //arr2.length always gives the no. of rows i.e. 3
        for(int i = 0; i< arr2.length; i++){
            for (int j = 0;j< arr2[i].length; j++){
                System.out.print(arr2[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("Arrays.tostring");
        for(int i = 0; i< arr2.length; i++){
            System.out.println(Arrays.toString(arr2[i]));
        }

        System.out.println("Foreach");
        for (int[] num: arr2) {
            System.out.println(Arrays.toString(num));
        }

//        for(int i = 0; i< arr2D.length; i++){
//            for(int j =0 ; j< arr2D[i].length; j++){
//                arr2D[i][j] = sc.nextInt();
//            }
//            System.out.println();
//        }

//        for(int i = 0; i< arr2D.length; i++){
//            for(int j =0 ; j<arr2D[i].length; j++){
//                System.out.print(arr2D[i][j] + " ");
//            }
//            System.out.println();
//        }

    }
}
