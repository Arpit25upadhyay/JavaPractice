public class Pattern {
    public static void main(String[] args) {
//        System.out.println("------Pattern 1---------");
//        Pattern1(4);
//        System.out.println("------Pattern 2---------");
//        Pattern2(4);
//        System.out.println("------Pattern 3---------");
//        Pattern3(4);
//        System.out.println("------Pattern 4---------");
//        Pattern4(4);
//        System.out.println("------Pattern 5---------");
//        Pattern5(4);
//        System.out.println("------Pattern 6---------");
//        Pattern6(4);
//        System.out.println("------Pattern 28---------");
//        Pattern28(4);
//        System.out.println("------Pattern 30---------");
//        Pattern30(4);

//        System.out.println("------Pattern 17---------");
//        Pattern17(4);
        System.out.println("------Pattern 31---------");
        Pattern31(4);

    }

    public  static  void Pattern2(int n){
        //for(int i = 1; i<=n; i++){
        for(int i = 0; i< n; i++){
            //for(int j = 1 ; j<=i;  j++){
            for(int j = 0 ; j<=i;  j++){
                System.out.print("x ");
            }
            System.out.println();
        }
    }
    public  static  void Pattern1(int n){
        //for(int i = 1; i<=n; i++){
        for(int i = 0; i< n; i++){
            //for(int j = 1 ; j<=i;  j++){
            for(int j = 0 ; j<n;  j++){
                System.out.print("x ");
            }
            System.out.println();
        }
    }

    public  static  void Pattern3(int n){
        //for(int i = 1; i<=n; i++){
        for(int i = 0; i< n; i++){
            //for(int j = 1 ; j<=i;  j++){
            //for(int j = n ; j>i;  j--){
            for(int j = 0 ; j<n-i;  j++ ){
                System.out.print("x ");
            }
            System.out.println();
        }
    }

    public  static  void Pattern4(int n){
        //for(int i = 1; i<=n; i++){
        for(int i = 0; i< n; i++){
            //for(int j = 1 ; j<=i;  j++){
            for(int j = 0 ; j<=i;  j++){
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }

    public  static  void Pattern5(int n){
        //for(int i = 1; i<=n; i++){
        for(int i = 0; i< n; i++){
            //for(int j = 1 ; j<=i;  j++){
            for(int j = 0 ; j<=i;  j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int k = 0; k<= n ; k++){
            for(int l = 0; l < n+1-k; l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public  static  void Pattern6(int n){
        for (int i = 0; i<n ; i++){
            for(int j = 0; j< n-i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k<= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public  static  void Pattern28(int n){
        for (int i = 0; i<2*n ; i++){
            int totalColinRow = i > n? 2*n - i : i ;
            int spaceCount =  n - totalColinRow;
            for(int j = 0; j< spaceCount; j++){
                System.out.print(" ");
            }
            for(int k = 0; k< totalColinRow; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static  void Pattern30(int n){
        for(int i = 1; i<= n; i++){

            for(int s = 1; s <= n-i; s++){
                System.out.print(" ");
            }

            for(int j = i; j>=1; j--){
                System.out.print(j);
            }
            for(int j = 2; j<=i; j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static  void Pattern17(int n){
        for(int i = 1; i<= 2*n; i++){

            int c = i > n ? 2* n - i : i;

            //int a = i <= n ? n - i : i - n;
            //Space
            for(int s = 1; s <= n-c; s++){
                System.out.print(" ");
            }

            for(int j = c; j>=1; j--){
                System.out.print(j);
            }
            for(int j = 2; j<=c; j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static  void Pattern31(int n){
        for(int i = 1; i< 2*n; i++){
            for(int j = 1; j< 2*n; j++){
                int value = Math.min(Math.min(i, 2*n-i),Math.min(j, 2*n-j));
                System.out.print(n - value+1 + " ");
            }
            System.out.println();
        }
    }





}
