public class PowerOf2 {
    public static void main(String[] args) {
        int n = 2;
        if(n!=0){
            System.out.println((n&(n-1))==0);
        }else{
            System.out.println(false);
        }

    }
}
