public class Patterns {
    public static void main(String[] args) {
        System.out.println("Pattern 1 \n");
        pattern1(4);

        System.out.println("Pattern 2 \n");
        pattern2(5);

        System.out.println("Pattern 3 \n");
        pattern3(5);

        System.out.println("Patter 4 \n");
        pattern4(5);

        System.out.println("Patter 5 \n");
        pattern5(5);

        System.out.println("Patter 6 \n");
        pattern6(5);

        System.out.println("Patter 7 \n");
        pattern7(5);

        System.out.println("Patter 8 \n");
        pattern8(5);

        System.out.println("Patter 9 \n");
        pattern9(5);

        System.out.println("Patter 10 \n");
        pattern10(5);

        System.out.println("Patter 11 \n");
        pattern11(5);

        System.out.println("pattern 12 \n");
        pattern12(5);

        System.out.println("pattern 13 \n");
        pattern13(5);

        System.out.println("pattern 16 \n");
        pattern16(5);

        System.out.println("Pattern 161 \n");
        pattern161(5);
    }

    public  static  void pattern1(int n){
        for(int i = 1; i<=n ;i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print("&");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i+1; j++){
                System.out.print("^ ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        for(int i = 1; i<=(2*n)-1; i++){
            if(i<=n){
                for(int j = 1; j<=i; j++){
                    System.out.print("^ ");
                }
            }else{
                for(int j = 1; j<= (2*n)-i; j++){
                    System.out.print("^ ");
                }
            }

            System.out.println();
        }
    }

    public static void pattern6(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<= i-1; j++){
                System.out.print(" ");
            }
            for(int k = n; k>=i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n){
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=(2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern9(int n){
        //no. of rows
        for(int i =1; i<=n; i++){
            //space
            for(int j = 1; j<=i-1; j++){
                System.out.print(" ");
            }
            for (int k = i; k<=(2*n)-i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern10(int n){
        for(int i =1; i<=n; i++){
            for(int j = 1; j<n-i+1; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern11(int n){
        for(int i = 1; i<=n ; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=n-i+1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern12(int n){
        for(int i = 1; i<=(2*n) ; i++){
            if(i<=n){
                for(int j=0; j<i; j++){
                    System.out.print(" ");
                }
                for(int k = 1; k<=n-i+1; k++){
                    System.out.print("* ");
                }
            }else{
                for(int j=1; j <= (2*n)-i+1 ; j++){
                    System.out.print(" ");
                }
                for(int k = 1; k<=i-n; k++){
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }

    public static void pattern13(int n){
        for(int i = 1; i<n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i)-1; k++) {
                if (k == 1 || k ==(2*i)-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i < (2 * n); i++) {
            System.out.print("*");
        }
    }

    public static void pattern16(int n){
        for(int i =1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<= (2*i)-1; k++){
                if(k== 1 || k== (2*i)-1){
                    System.out.print("1");
                }else if(k == i){
                    System.out.print(i);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern161(int numRows) {
        for (int i = 0; i < numRows; i++) {
            // Print spaces
            for (int j = 0; j < numRows - i - 1; j++) {
                System.out.print("  ");
            }
            int num = 1;
            // Print numbers in each row
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", num);
                num = num * (i - j) / (j + 1);
            }
            // Move to the next line
            System.out.println();
        }
    }
}


