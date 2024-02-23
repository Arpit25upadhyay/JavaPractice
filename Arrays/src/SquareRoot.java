public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(sqRoot(4));
    }
    static int sqRoot(int x){
//        int i =1;
//
//        while(i<=x/i){
//            if(i*i == x){
//                return i;
//            }
//            i=i+1;
//        }
//        return i-1;


        int i=1;
        for(;i<=x/i;i++) //using division instead of multiplication to avoid integer overflow
            if(x/i==i)  return i;
        return i-1; //returning
    }
}
