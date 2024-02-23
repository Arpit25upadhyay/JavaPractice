public class Stairs {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
        System.out.println(2*(2+1)/2);
    }
    public static int arrangeCoins(int n) {
        long start=0;
        long end=n;
        while (start<=end){
            long mid=start+(end-start)/2;
            if(n>=mid*(mid+1)/2){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return (int)end;
    }
}
